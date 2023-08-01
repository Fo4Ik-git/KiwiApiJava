package com.fo4ik.responce;

public class Availability {
    private int seats;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Availability{" +
                "seats=" + seats +
                '}';
    }
}
