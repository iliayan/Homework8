public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    // Конструктор за замовчуванням
    public Car() {
        // Викликаємо конструктор із 4-ма параметрами зі значеннями за замовчуванням
        this(2022, 0.0, 1500, "Unknown");
    }

    // Конструктор із 1-м параметром
    public Car(int year) {
        // Викликаємо конструктор із 4-ма параметрами з частково встановленими значеннями
        this(year, 0.0, 1500, "Unknown");
    }

    // Конструктор із 2-ма параметрами
    public Car(int year, double speed) {
        // Викликаємо конструктор із 4-ма параметрами з частково встановленими значеннями
        this(year, speed, 1500, "Unknown");
    }

    // Конструктор із 3-ма параметрами
    public Car(int year, double speed, int weight) {
        // Викликаємо конструктор із 4-ма параметрами з частково встановленими значеннями
        this(year, speed, weight, "Unknown");
    }

    // Конструктор із 4-ма параметрами
    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    // Гетери та сетери для кожного поля
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Перевантажений метод toString для виведення інформації про об'єкт
    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }