package com.driver.model;

import javax.persistence.*;

@Entity
@Table(name = "cab")
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int carId;

    private int perKmRate;

    private boolean available;

    @OneToOne
    @JoinColumn
    Driver driver;

    public Cab() {
    }

    public Cab(int carId, int perKmRate, boolean available, Driver driver) {
        this.carId = carId;
        this.perKmRate = perKmRate;
        this.available = available;
        this.driver = driver;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}