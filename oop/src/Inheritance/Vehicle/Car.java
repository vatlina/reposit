package Inheritance.Vehicle;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void drive() {
        System.out.println("The vehicle is driven by the engine - Автомобиль приводится в движение двигателем");
    }
}