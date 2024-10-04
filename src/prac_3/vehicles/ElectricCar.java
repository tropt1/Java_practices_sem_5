package prac_3.vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar() {
        this.engineType = "Electric";
    }

    // геттер и сеттер
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
