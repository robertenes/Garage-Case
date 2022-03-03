package com.garage.garage;

import com.garage.model.abstracts.Vehicle;
import com.garage.model.dto.VehicleInstanceDto;
import com.garage.repository.concretes.VehicleDaoManager;
import com.garage.service.abstracts.VehicleService;
import com.garage.service.concretes.VehicleManager;
import com.garage.utility.Result;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class GarageApplicationTests {

    @InjectMocks
    private VehicleDaoManager vehicleDao;
    @Mock
    private VehicleService vehicleService;

    @BeforeEach
    void initVehicleService() {
        vehicleService = new VehicleManager(vehicleDao);
    }

    @Test
    void pushVehicleToGarageTest() {
        Vehicle vehicle = VehicleInstanceDto.createInstance("Car", "Blue", "34-UT-8787");
        Result result = vehicleService.pushVehicleToGarage(vehicle);
        assert result.isSuccess();
    }

    @Test
    void popVehicleFromGarageTest() {
        Vehicle vehicle = VehicleInstanceDto.createInstance("Car", "Blue", "34-UT-8787");
        vehicleService.pushVehicleToGarage(vehicle);
        Result result = vehicleService.pullCarFromGarage(1);
        assert result.isSuccess();
    }

    @Test
    void pushMultiVehicleToGarageTest() {
        Vehicle vehicle1 = VehicleInstanceDto.createInstance("Car", "Blue", "34-UT-8787");
        Vehicle vehicle2 = VehicleInstanceDto.createInstance("Jeep", "Black", "34-FG-4578");
        Vehicle vehicle3 = VehicleInstanceDto.createInstance("Jeep", "White", "34-RE-1234");
        Vehicle vehicle4 = VehicleInstanceDto.createInstance("Truck", "Green", "34-CV-4578");
        vehicleService.pushVehicleToGarage(vehicle1);
        vehicleService.pushVehicleToGarage(vehicle2);
        vehicleService.pushVehicleToGarage(vehicle3);
        Result result = vehicleService.pushVehicleToGarage(vehicle4);
        assert !result.isSuccess();
    }

    @Test
    void pushAndPopVehicleToGarageTest() {
        Vehicle vehicle1 = VehicleInstanceDto.createInstance("Car", "Blue", "34-UT-8787");
        Vehicle vehicle2 = VehicleInstanceDto.createInstance("Jeep", "Black", "34-FG-4578");
        Vehicle vehicle3 = VehicleInstanceDto.createInstance("Jeep", "White", "34-RE-1234");
        Vehicle vehicle4 = VehicleInstanceDto.createInstance("Truck", "Green", "34-CV-4578");
        vehicleService.pushVehicleToGarage(vehicle1);
        vehicleService.pushVehicleToGarage(vehicle2);
        vehicleService.pushVehicleToGarage(vehicle3);
        Result result1 = vehicleService.pushVehicleToGarage(vehicle4);
        vehicleService.pullCarFromGarage(1);
        vehicleService.pullCarFromGarage(1);
        vehicleService.pullCarFromGarage(1);
        Result result2 = vehicleService.pushVehicleToGarage(vehicle4);
        assert !result1.isSuccess() && result2.isSuccess();
    }

}
