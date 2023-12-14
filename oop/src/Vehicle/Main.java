package Vehicle;
/*Создать родительский класс Vehicle, содержащий общие характеристики для дочерних классов Truck и PassengerCar.
        Класс Truck должен быть дочерним классом класса Vehicle. У класса Truck должны быть как общие с классом Vehicle
        характеристики, так и свои уникальные.
        Кроме него, также создать еще один дочерний класс класса Vehicle - PassengerCar. У класса PassengerCar также
        должны быть как общие с классом Vehicle характеристики, так и свои уникальные.*/
public class Main {
    public static void main(String[] args) {
        Truck truck1 = new Truck("HeavyTruck", "Manufacturer1", 2022, "Red", "Driver1", 10, 50);
        PassengerCar car1 = new PassengerCar("Sedan", "Manufacturer2", 2021, "Blue", "Driver2", 15, 5);

        truck1.load(40);
        truck1.drive();
        truck1.unload(20);
        truck1.stop();

        car1.drive();
        car1.displayPassengerCapacity();
        car1.stop();

        System.out.println("Truck1 owner: " + truck1.getOwnerName());
        System.out.println("Car1 owner: " + car1.getOwnerName());
    }
}