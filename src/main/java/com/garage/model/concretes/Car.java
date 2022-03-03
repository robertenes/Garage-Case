package com.garage.model.concretes;

import com.garage.model.abstracts.Vehicle;

public class Car extends Vehicle {

    public Car(String colour, String plate) {
        super("Car", colour, plate, 1);
    }
}

