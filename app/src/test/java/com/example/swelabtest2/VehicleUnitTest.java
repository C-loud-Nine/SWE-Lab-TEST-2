package com.example.swelabtest2;

import org.junit.Test;
import static org.junit.Assert.*;

public class VehicleUnitTest {

    @Test
    public void testWheels() {
        Vehicle vehicle = new Vehicle(4);
        assertEquals(4, vehicle.getWheels());
    }

    @Test
    public void testFuel() {
        Vehicle vehicle = new Vehicle(4);
        assertEquals(0.0, vehicle.getFuel(), 0.0);
    }

    @Test
    public void testMileage() {
        Vehicle vehicle = new Vehicle(4);
        assertEquals(0.0, vehicle.getMileage(), 0.0);
    }

    @Test
    public void testPetrol() {
        Vehicle vehicle = new Vehicle(4);
        vehicle.petrol(10.0);
        assertEquals(10.0, vehicle.getFuel(), 0.0);
    }

    @Test
    public void testDrive() {
        Vehicle vehicle = new Vehicle(4);
        vehicle.petrol(10.0);
        vehicle.drive(5.0, 2.0);
        assertEquals(5.0, vehicle.getMileage(), 0.0);
        assertEquals(8.0, vehicle.getFuel(), 0.0);
    }
}
