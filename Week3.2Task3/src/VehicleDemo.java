import java.util.ArrayList;
import java.util.List;

public class VehicleDemo {
    public static void main(String[] args) {
        List<AbstractVehicle> list = new ArrayList<>();
        list.add(new Car("Red"));
        list.add(new Motorcycle("Green"));
        list.add(new Bus("Blue"));
        list.add(new ElectricCar("Magenta"));
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
    }
}