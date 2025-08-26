import java.util.ArrayList;
import java.util.List;

public class VehicleDemo {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Car("Red"));
        list.add(new Motorcycle("Green"));
        list.add(new Bus("Blue"));
        System.out.println("Vehicle Demonstration\n");
        for (Vehicle v : list) {
            v.start();
        }
        System.out.println(" ");
        for (Vehicle v : list) {
            v.stop();
        }
        System.out.println(" ");
        for (Vehicle v : list) {
            System.out.println(v.getInfo()+ "\n");
        }

    }
}