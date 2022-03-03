package com.garage.model.concretes;

import com.garage.model.abstracts.Vehicle;

public class Ticket {
    private String ticketNumber;
    private Vehicle vehicle;

    public Ticket(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.ticketNumber = vehicle.getPlate();
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public Vehicle getvehicle() {
        return vehicle;
    }
}
