import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VehicleDemo {
    public static void main(String[] args) {
        List<AbstractVehicle> list = new ArrayList<>();
        list.add(new Car("Red", 6));
        list.add(new Motorcycle("Green", 4));
        list.add(new Bus("Blue", 12));
        list.add(new ElectricCar("Magenta", 25));
        System.out.println("Vehicle Demonstration\n");
        for (AbstractVehicle v : list) {
            v.start();
        }
        System.out.println(" ");
        for (AbstractVehicle v : list) {
            v.stop();
        }
        System.out.println(" ");
        for (AbstractVehicle v : list) {
            System.out.println(v.getInfo()+ "\n");
        }
        System.out.println(" ");
        for (AbstractVehicle v : list) {
            v.charge();
        }
        System.out.println(" ");
        for (AbstractVehicle v : list) {
            if (Objects.equals(v.getType(),"Car") || Objects.equals(v.getType(),"Bus") ||
                    Objects.equals(v.getType(),"Motorcycle")) {
                System.out.println("Fuel efficiency of " + v.getType() +
                        " is " + v.calculateFuelEfficiency() + " km/l");
            } else {
                System.out.println("Energy efficiency of " + v.getType() +
                        " is " + v.calculateFuelEfficiency() + " km/kWh");
            }
        }
    }
}