package trucks;
/*Создать класс грузовик Truck, содержащий общие характеристики грузовиков: model, manufacturer, year (год выпуска), colour, грузоподьемность, наличие топлива, имя владельца и имеющий следующее поведение:
        1. должен уметь загружаться (load)  и при этом сообщать, если превышена его грузоподьемность а также сообщать, сколько еще можно загрузить груза
        2. разгружаться и  при этом сообщать в случае если пытаются разгрузить больше чем имеющийся у него на борту груз или пытаются разгрузить отрицательный груз. Также должен сообщать вес остающегося на борту груза
        3. В случае отсутствия топлива или отсутствия груза на борту сообщать о невозможности ехать
        4. Должен уметь ездить и останавливаться
        5. уметь заправляться топливом
        6. уметь сообщать имя владельца
        Создать два грузовика, протестировать их работу, сложить в массив и вывести на экран результат*/
public class Truck {
    private String model;
    private String manufacturer;
    private int year;
    private String colour;
    private double maxWeight;
    private double currentWeight;
    private double maxFuel;
    private double currentFuel;
    private String owner;

    public Truck(String model, String manufacturer, int year, String colour, double maxWeight, double maxFuel, String owner) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.colour = colour;
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.maxFuel = maxFuel;
        this.currentFuel = 0;
        this.owner = owner;
    }

    public void load(double weight) {
        if (currentWeight + weight > maxWeight) {
            System.out.println("Превышена грузоподъемность. Максимальный вес: " + maxWeight + " кг");
        } else {
            currentWeight += weight;
            System.out.println("Груз успешно загружен. Осталось места: " + (maxWeight - currentWeight) + " кг");
        }
    }

    public void unload(double weight) {
        if (weight < 0 || weight > currentWeight) {
            System.out.println("Некорректный вес для разгрузки.");
        } else {
            currentWeight -= weight;
            System.out.println("Груз успешно разгружен. Осталось груза: " + currentWeight + " кг");
        }
    }

    public void drive() {
        if (currentFuel <= 0 || currentWeight <= 0) {
            System.out.println("Не удается ехать. Проверьте уровень топлива и наличие груза.");
        } else {
            System.out.println("Грузовик едет.");
        }
    }

    public void stop() {
        System.out.println("Грузовик остановился.");
    }

    public void refuel(double fuel) {
        if (currentFuel + fuel > maxFuel) {
            System.out.println("Превышен объем топливного бака. Максимальный объем: " + maxFuel + " л");
        } else {
            currentFuel += fuel;
            System.out.println("Топливо успешно заправлено. Осталось топлива: " + currentFuel + " л");
        }
    }

    public String getOwner() {
        return owner;
    }

    public static void main(String[] args) {
        Truck truck1 = new Truck("Volvo", "Volvo Trucks", 2022, "Red", 5000, 200, "John Doe");
        Truck truck2 = new Truck("Scania", "Scania AB", 2021, "Blue", 7000, 300, "Jane Smith");

        System.out.println("Грузовик 1: " + truck1.getOwner());
        truck1.load(3000);
        truck1.drive();
        truck1.stop();

        System.out.println("\nГрузовик 2: " + truck2.getOwner());
        truck2.load(8000);
        truck2.unload(2000);
        truck2.refuel(50);
        truck2.drive();
    }
}
