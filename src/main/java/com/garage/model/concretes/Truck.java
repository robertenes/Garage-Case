package com.garage.model.concretes;

import com.garage.model.abstracts.Vehicle;

public class Truck extends Vehicle {

    public Truck(String colour, String plate) {
        super("Truck", colour, plate, 4);
    }
}
