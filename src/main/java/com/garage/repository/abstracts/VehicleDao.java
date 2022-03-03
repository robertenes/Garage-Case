package com.garage.repository.abstracts;

import com.garage.model.abstracts.Vehicle;

public interface VehicleDao {

    boolean pushVehicleToGarage(Vehicle vehicle);

    boolean popCarFromGarage(int key);

    String getStatus();

    boolean emptyControlForVehicleList();


}
