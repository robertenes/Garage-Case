package com.garage.service.abstracts;

import com.garage.model.abstracts.Vehicle;
import com.garage.utility.Result;

public interface VehicleService {

    Result pushVehicleToGarage(Vehicle vehicle);

    Result pullCarFromGarage(int key);

    Result getStatus();
}
