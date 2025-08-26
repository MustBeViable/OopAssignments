import java.util.Objects;

public class Bus extends AbstractVehicle {
    final private String type = "Bus";
    final private String fuel = "Diesel";
    private String color;

    public Bus(String color) {
        this.color = color;
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
    public void charge() {
        if (!Objects.equals(this.fuel, "Electricity")) {
            System.out.println("This vehicle " + this.type + " cannot be charged.");
        } else {
            System.out.println("Charging...");
        }
    }
}
