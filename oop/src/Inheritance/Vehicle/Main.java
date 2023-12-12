/*Написать как минимум одну иерархию классов в которой будет один родительский класс и два наследника,
расширяющих его функционал*/
package Inheritance.Vehicle;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", 2022, 4);
        Bicycle myBicycle = new Bicycle("Trek", 2021, 21);

        System.out.println("Car Brand - марка транспортного средства: " + myCar.getBrand());
        System.out.println("Car Doors - количество дверей: " + myCar.getNumberOfDoors());
        myCar.start();
        myCar.drive();
        myCar.stop();

        System.out.println("\nBicycle Brand - марка велосипеда: " + myBicycle.getBrand());
        System.out.println("Bicycle Gears - число передач: " + myBicycle.getNumberOfGears());
        myBicycle.start();
        myBicycle.pedal();
        myBicycle.stop();
    }
}