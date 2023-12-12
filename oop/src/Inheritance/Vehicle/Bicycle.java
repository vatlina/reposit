package Inheritance.Vehicle;

public class Bicycle extends Vehicle {
    private int numberOfGears;

    public Bicycle(String brand, int year, int numberOfGears) {
        super(brand, year);
        this.numberOfGears = numberOfGears;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void pedal() {
        System.out.println("The bicycle is pedal-powered - Велосипед приводится в движение от педалей.");
    }
}