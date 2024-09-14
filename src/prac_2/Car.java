package prac_2;

public class Car {
    private String model;
    private String license;
    private String color;
    private int year;


    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public Car() {
        this.model = "Неизвестно";
        this.license = "Неизвестно";
        this.color = "Неизвестно";
        this.year = 0;
    }
    public Car(String model, int year) {
        this.model = model;
        this.license = "Неизвестно";
        this.color = "Неизвестно";
        this.year = year;
    }


    // геттеры
    public String getModel() {
        return model;
    }

    public String getLicense() {
        return license;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    // сеттеры
    public void setModel(String model) {
        this.model = model;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCarAge(int currentYear) {
        return currentYear - this.year;
    }


    public String To_String() {
        return "Модель: " + model + ", Номер: " + license + ", Цвет: " + color + ", Год: " + year;
    }
}
