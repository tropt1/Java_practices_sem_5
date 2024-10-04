package prac_4.app;

import prac_4.vehicles.*;

public class TestCar {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota Land Cruiser", "ABC123", "White", 2020, "Pupa", "12345");
        Vehicle electricCar = new ElectricCar("Tesla Model X", "XYZ789", "Blue", 2023, "Lupa", "67890", 75);

        car.setColor("Black");
        electricCar.setOwnerName("Zapupa");

        System.out.println(car.toString());
        System.out.println(electricCar.toString());
    }
}