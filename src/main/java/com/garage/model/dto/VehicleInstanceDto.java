package com.garage.model.dto;

import com.garage.model.abstracts.Vehicle;
import com.garage.model.concretes.Car;
import com.garage.model.concretes.Jeep;
import com.garage.model.concretes.Truck;

import java.util.Locale;

public class VehicleInstanceDto {

    public static Vehicle createInstance(String carName, String colourName, String plate) {
        if (carName.toLowerCase(Locale.ROOT).equals("car"))
            return new Car(colourName, plate);
        if (carName.toLowerCase(Locale.ROOT).equals("jeep"))
            return new Jeep(colourName, plate);
        else
            return new Truck(colourName, plate);
    }
}
