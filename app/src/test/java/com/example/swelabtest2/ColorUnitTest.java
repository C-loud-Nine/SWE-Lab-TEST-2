package com.example.swelabtest2;

import org.junit.Test;
import static org.junit.Assert.*;

public class ColorUnitTest {

    @Test
    public void testGetName_Red() {
        Color red = new Red();
        assertEquals("Red", red.getName());
    }

    @Test
    public void testGetName_Blue() {
        Color blue = new Blue();
        assertEquals("Blue", blue.getName());
    }

    @Test
    public void testGetName_Green() {
        Color green = new Green();
        assertEquals("Green", green.getName());
    }
}
