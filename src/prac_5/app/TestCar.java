package prac_5.app;

import prac_5.vehicles.*;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("Toyota Land Cruiser", "ABC123", "White", 2020,
                "Pupa", "12345");
        ElectricCar electricCar = new ElectricCar("Tesla Model X", "XYZ789", "Red",
                2022, "Lupa", "67890", 75);

        System.out.println(car);
        System.out.println("Vehicle Type: " + car.vehicleType());

        System.out.println(electricCar);
        System.out.println("Vehicle Type: " + electricCar.vehicleType());
        System.out.println("Battery Capacity: " + electricCar.getBatteryCapacity());
    }
}
