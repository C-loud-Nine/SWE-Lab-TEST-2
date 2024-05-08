package com.example.swelabtest2;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import org.junit.Rule;
import org.junit.Test;
import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import org.junit.Before;
import org.junit.Test;

public class MainActivityUITest {

    @Before
    public void launchActivity() {
        ActivityScenario.launch(MainActivity.class);
    }

    @Test
    public void testSedanButton() {
        Espresso.onView(ViewMatchers.withId(R.id.sedanButton))
                .perform(ViewActions.click());


        Espresso.onView(ViewMatchers.withId(R.id.vehicleInfoTextView))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .check(ViewAssertions.matches(ViewMatchers.withText("Vehicle Information:\nType: Sedan\nMileage: 5.0 miles\nFuel: 8.0 liters")));
    }

    @Test
    public void testMotorcycleButton() {
        Espresso.onView(ViewMatchers.withId(R.id.motorcycleButton))
                .perform(ViewActions.click());


        Espresso.onView(ViewMatchers.withId(R.id.vehicleInfoTextView))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .check(ViewAssertions.matches(ViewMatchers.withText("Vehicle Information:\nType: Motorcycle\nMileage: 1.5 miles\nFuel: 4.5 liters")));
    }

    @Test
    public void testColorInfo() {
        Espresso.onView(ViewMatchers.withId(R.id.colorInfoTextView))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .check(ViewAssertions.matches(ViewMatchers.withText("Color Information:\nRed\nBlue\nGreen")));
    }
}
