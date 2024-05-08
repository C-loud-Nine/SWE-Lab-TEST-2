package com.example.swelabtest2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

// Vehicle Class
class Vehicle {
    private int wheels;
    private double fuel;
    private double mileage;

    public Vehicle(int wheels) {
        this.wheels = wheels;
        this.fuel = 0.0;
        this.mileage = 0.0;
    }

    public int getWheels() {
        return wheels;
    }

    public double getFuel() {
        return fuel;
    }

    public double getMileage() {
        return mileage;
    }

    public void petrol(double amount) {
        fuel += amount;
    }

    public void drive(double distance, double fuelConsumption) {
        if (fuel >= fuelConsumption) {
            mileage += distance;
            fuel -= fuelConsumption;
        }
    }
}

// Subclasses of Vehicle
class Sedan extends Vehicle {
    public Sedan() {
        super(4);
    }

    public void drive() {
        super.drive(5.0, 2.0);
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle() {
        super(2);
    }

    public void drive() {
        super.drive(1.5, 0.5);
    }
}

class SUV extends Vehicle {
    public SUV() {
        super(4);
    }

    public void drive() {
        super.drive(4.0, 2.5);
    }
}

// Color Class
class Color {
    private String name;

    public Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Subclasses of Color
class Red extends Color {
    public Red() {
        super("Red");
    }
}

class Blue extends Color {
    public Blue() {
        super("Blue");
    }
}

class Green extends Color {
    public Green() {
        super("Green");
    }
}

public class MainActivity extends AppCompatActivity {

    TextView vehicleInfoTextView, colorInfoTextView;
    Button sedanButton, motorcycleButton, suvButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize TextViews
        vehicleInfoTextView = findViewById(R.id.vehicleInfoTextView);
        colorInfoTextView = findViewById(R.id.colorInfoTextView);

        // Initialize Buttons
        sedanButton = findViewById(R.id.sedanButton);
        motorcycleButton = findViewById(R.id.motorcycleButton);
        suvButton = findViewById(R.id.suvButton);

        // Set Click Listeners for Buttons
        sedanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sedan sedan = new Sedan();
                sedan.petrol(10.0);
                sedan.drive();
                vehicleInfoTextView.setText("Vehicle Information:\n" +
                        "Type: Sedan\n" +
                        "Mileage: " + sedan.getMileage() + " miles\n" +
                        "Fuel: " + sedan.getFuel() + " liters");
            }
        });

        motorcycleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Motorcycle motorcycle = new Motorcycle();
                motorcycle.petrol(5.0);
                motorcycle.drive();
                vehicleInfoTextView.setText("Vehicle Information:\n" +
                        "Type: Motorcycle\n" +
                        "Mileage: " + motorcycle.getMileage() + " miles\n" +
                        "Fuel: " + motorcycle.getFuel() + " liters");
            }
        });

        suvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SUV suv = new SUV();
                suv.petrol(15.0);
                suv.drive();
                vehicleInfoTextView.setText("Vehicle Information:\n" +
                        "Type: SUV\n" +
                        "Mileage: " + suv.getMileage() + " miles\n" +
                        "Fuel: " + suv.getFuel() + " liters");
            }
        });

        // Display color information
        colorInfoTextView.setText("Color Information:\n" +
                "Red\n" +
                "Blue\n" +
                "Green");
    }
}
