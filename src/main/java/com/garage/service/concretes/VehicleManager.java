package com.garage.service.concretes;

import com.garage.model.abstracts.Vehicle;
import com.garage.model.dto.VehicleInstanceDto;
import com.garage.repository.abstracts.VehicleDao;
import com.garage.service.abstracts.VehicleService;
import com.garage.utility.ErrorResult;
import com.garage.utility.Result;
import com.garage.utility.SuccessResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehicleManager implements VehicleService {

    private final VehicleDao VehicleDao;

    @Override
    public Result pushVehicleToGarage(Vehicle vehicle) {
        Vehicle vehicleEntity = VehicleInstanceDto.createInstance(vehicle.getVehicleType().trim(),
                vehicle.getColour().trim(), vehicle.getPlate().trim());

        if (VehicleDao.pushVehicleToGarage(vehicleEntity)) {
            return new SuccessResult("Allocated for ", vehicleEntity.getSlot());
        }
        return new ErrorResult("Garage is full");
    }

    @Override
    public Result pullCarFromGarage(int key) {
        if (VehicleDao.popCarFromGarage(key)) {
            return new SuccessResult("Vehicle left");
        }
        return new ErrorResult("Can not find vehicle");
    }

    @Override
    public Result getStatus() {
        if (!VehicleDao.emptyControlForVehicleList())
            return new SuccessResult(VehicleDao.getStatus());
        return new ErrorResult("Garage is empty");
    }
}
