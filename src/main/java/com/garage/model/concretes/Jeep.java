package com.garage.model.concretes;

import com.garage.model.abstracts.Vehicle;

public class Jeep extends Vehicle {

    public Jeep(String colour, String plate) {
        super("Jeep", colour, plate, 2);
    }
}
