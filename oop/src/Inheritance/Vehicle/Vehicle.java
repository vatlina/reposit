package Inheritance.Vehicle;

public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void start() {
        System.out.println("The vehicle is starting - Транспортное средство приводится в движение.");
    }

    public void stop() {
        System.out.println("The vehicle is stopping - Транспортное средство останавливается.");
    }
}