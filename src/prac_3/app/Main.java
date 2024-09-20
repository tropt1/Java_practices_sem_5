package prac_3.app;

import prac_3.vehicles.Car;
import prac_3.vehicles.ElectricCar;


public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setOwnerName("John Doe");
        car.setInsuranceNumber("123456789");
        car.setEngineType("Petrol");

        ElectricCar electricCar = new ElectricCar();
        electricCar.setOwnerName("Jane Doe");
        electricCar.setInsuranceNumber("987654321");
        electricCar.setBatteryCapacity(100);

        // вывод информации о машинах
        System.out.println("Car Owner: " + car.getOwnerName());
        System.out.println("Car Insurance Number: " + car.getInsuranceNumber());
        System.out.println("Car Engine Type: " + car.getEngineType());

        System.out.println("Electric Car Owner: " + electricCar.getOwnerName());
        System.out.println("Electric Car Insurance Number: " + electricCar.getInsuranceNumber());
        System.out.println("Electric Car Engine Type: " + electricCar.getEngineType());
        System.out.println("Electric Car Battery Capacity: " + electricCar.getBatteryCapacity());
    }
}
