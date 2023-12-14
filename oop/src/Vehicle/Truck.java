package Vehicle;
class Truck extends Vehicle {
    private double maxWeight;
    private double cargoWeight;

    public Truck(String model, String manufacturer, int year, String colour, String ownerName,
                 double fuel, double maxWeight) {
        super(model, manufacturer, year, colour, ownerName, fuel);
        this.maxWeight = maxWeight;
        this.cargoWeight = 0;
    }

    public void load(double weight) {
        if (cargoWeight + weight <= maxWeight) {
            cargoWeight += weight;
            System.out.println("Loaded " + weight + " units of cargo. Remaining capacity: " + (maxWeight - cargoWeight));
        } else {
            System.out.println("Cannot load, exceeded maximum weight. Remaining capacity: " + (maxWeight - cargoWeight));
        }
    }

    public void unload(double weight) {
        if (weight >= 0 && weight <= cargoWeight) {
            cargoWeight -= weight;
            System.out.println("Unloaded " + weight + " units of cargo. Remaining cargo: " + cargoWeight);
        } else {
            System.out.println("Invalid unload operation. Cannot unload specified weight.");
        }
    }

    @Override
    public void drive() {
        int fuel = 0;
        if (fuel > 0 && cargoWeight > 0) {
            System.out.println("Truck is moving with cargo.");
            fuel--;
        } else {
            System.out.println("No fuel or no cargo, cannot drive.");
        }
    }

    public double getCargoWeight() {
        return cargoWeight;
    }
}