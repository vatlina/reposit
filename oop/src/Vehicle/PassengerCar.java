package Vehicle;
class PassengerCar extends Vehicle {
    private int passengerCapacity;

    public PassengerCar(String model, String manufacturer, int year, String colour, String ownerName,
                        double fuel, int passengerCapacity) {
        super(model, manufacturer, year, colour, ownerName, fuel);
        this.passengerCapacity = passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void displayPassengerCapacity() {
        System.out.println("Passenger car capacity: " + passengerCapacity + " passengers.");
    }
}