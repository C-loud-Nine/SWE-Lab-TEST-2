package com.example.swelabtest2;

import org.junit.Test;
import static org.junit.Assert.*;

public class VehicleColorIntegrationTest {

    @Test
    public void testVehicleColorIntegration() {
        Vehicle sedan = new Sedan();
        Vehicle motorcycle = new Motorcycle();
        Vehicle suv = new SUV();

        Color red = new Red();
        Color blue = new Blue();
        Color green = new Green();

        assertEquals("Red", red.getName());
        assertEquals("Blue", blue.getName());
        assertEquals("Green", green.getName());

    }
}
