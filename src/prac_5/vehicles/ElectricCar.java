package prac_5.vehicles;

interface ElectricVehicle {
    int getBatteryCapacity();
    void setBatteryCapacity(int batteryCapacity);
}

public class ElectricCar extends Car implements ElectricVehicle {
    private int batteryCapacity;

    public ElectricCar(String model, String license, String color, int year, String ownerName, String insuranceNumber, int batteryCapacity) {
        super(model, license, color, year, ownerName, insuranceNumber);
        setEngineType("Electric");
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }
}
