package Vehicle;

class Vehicle {
    private String model;
    private String manufacturer;
    private int year;
    private String colour;
    private String ownerName;
    private double fuel;

    public Vehicle(String model, String manufacturer, int year, String colour, String ownerName, double fuel) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.colour = colour;
        this.ownerName = ownerName;
        this.fuel = fuel;
    }

    public void drive() {
        if (fuel > 0) {
            System.out.println("Vehicle is moving.");
            fuel--;
        } else {
            System.out.println("No fuel, cannot drive.");
        }
    }

    public void stop() {
        System.out.println("Vehicle stopped.");
    }

    public void refuel(double amount) {
        fuel += amount;
        System.out.println("Refueled. Current fuel level: " + fuel);
    }

    public String getOwnerName() {
        return ownerName;
    }
}

