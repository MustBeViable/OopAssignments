import java.util.Objects;

public class ElectricCar extends AbstractVehicle {
    final private String type = "Electric car";
    final private String fuel = "Electricity";
    private String color;

    public ElectricCar(String color, double fuelEfficiency) {
        this.color = color;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getType() {
        return this.type;
    }

    public void start() {
        System.out.printf("%s is starting...\n", this.type);
    }

    public void stop() {
        System.out.printf("%s is stopping...\n", this.type);
    }

    public String getInfo() {
        return this.type +  " Information:\nType: " + this.type + "\nFuel: " + this.fuel + "\nColor: " + this.color;
    }

    @Override
    public double calculateFuelEfficiency() {
        return this.fuelEfficiency;
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
