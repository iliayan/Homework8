public class Main {
    public static void main(String[] args) {
        // Створюємо екземпляри класу "Машина" з різними параметрами
        Car car1 = new Car(); // Використовуємо конструктор за замовчуванням
        Car car2 = new Car(2020); // Використовуємо конструктор із 1-м параметром
        Car car3 = new Car(2018, 120.0); // Використовуємо конструктор із 2-ма параметрами
        Car car4 = new Car(2015, 90.0, 2000); // Використовуємо конструктор із 3-ма параметрами
        Car car5 = new Car(2010, 80.0, 1800, "Blue"); // Використовуємо конструктор із 4-ма параметрами

        // Виводимо інформацію про кожен об'єкт
        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);
        System.out.println("Car 3: " + car3);
        System.out.println("Car 4: " + car4);
        System.out.println("Car 5: " + car5);
    }
}