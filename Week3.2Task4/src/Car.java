import java.util.Objects;

public class Car extends AbstractVehicle {

    final private String type = "Car";
    final private String fuel = "Bio Diesel";
    private String color;

    public Car(String color, double fuelEfficiency) {
        this.color = color;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public double calculateFuelEfficiency() {
        return this.fuelEfficiency;
    }

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }

    @Override
    public String getInfo() {
        return this.type +  " Information:\nType: " + this.type + "\nFuel: " + this.fuel + "\nColor: " + this.color;
    }
    @Override
    public void charge() {
        if (!Objects.equals(this.fuel, "Electricity")) {
            System.out.println("This vehicle " + this.type + " cannot be charged.");
        } else {
            System.out.println("Charging...");
        }
    }

}
