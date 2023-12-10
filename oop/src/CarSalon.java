/*Написать класс, содержащий метод, который проверяет есть ли данная машина в салоне. В случае, если машина найдена,
метод выводит на экран сообщение "Эта машина имеется в наличии". Если нет, то сообщение "Такой машины нет, возьмите
(дальше следует перечисление всех машин в салоне)". Результат работы метода вывести на экран в классе Main. Список машин
 в салоне должен передаваться через конструктор при создании обьекта, а название заказанной машины в качестве параметра
 метода.
Пример:String [] salon = {"Audi","BMW","Ford","Honda","Hyundai","Kia","Mazda"};
public void findCar(String carToFind)*/


public class CarSalon {
    private String[] carsInSalon;

    public CarSalon(String[] cars) {
        this.carsInSalon = cars;
    }

    public void findCar(String carToFind) {
        boolean carFound = false;

        for (String car : carsInSalon) {
            if (car.equalsIgnoreCase(carToFind)) {
                carFound = true;
                break;
            }
        }

        if (carFound) {
            System.out.println("Эта машина имеется в наличии.");
        } else {
            System.out.println("Такой машины нет, возьмите одну из следующих: ");
            for (String car : carsInSalon) {
                System.out.println(car);
            }
        }
    }

    public static void main(String[] args) {
        String[] salon = {"Audi", "BMW", "Ford", "Honda", "Hyundai", "Kia", "Mazda"};
        CarSalon carSalon = new CarSalon(salon);

        carSalon.findCar("Ford");
        carSalon.findCar("Toyota");
    }
}
