package vehicles;

public abstract class Vehicle {
    String make;
    String model;
    int mileage;
    String engineType;
    double price;

    public Vehicle(String make, String model, int mileage, String engineType, double price) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.engineType = engineType;
        this.price = price;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getMileage() {
        return this.mileage;
    }

    public String getEngineType() {
        return this.engineType;
    }

    public double getPrice() {
        return this.price;
    }

}


