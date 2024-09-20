package prac_2;

public class ex_2 {
    public static void main(String[] args) {
        // тест конструкторов
        Car car1 = new Car("Toyota", "ABC123", "Красная", 2015);
        Car car2 = new Car();
        Car car3 = new Car("Honda", 2018);

        // тест To_String()
        System.out.println("Машина 1: " + car1.To_String());
        System.out.println("Машина 2: " + car2.To_String());
        System.out.println("Машина 3: " + car3.To_String());

        // использование геттеров и сеттеров
        car2.setModel("BMW");
        car2.setLicense("ABC123");
        car2.setColor("Черная");
        car2.setYear(2020);

        System.out.println("Обновленная машина 2: " + car2.To_String());

        // получение возраста авто
        final int CURRENT_YEAR = 2024;
        System.out.println("Возраст машины 1: " + car1.getCarAge(CURRENT_YEAR));
        System.out.println("Возраст машины 3: " + car3.getCarAge(CURRENT_YEAR));
    }
}
