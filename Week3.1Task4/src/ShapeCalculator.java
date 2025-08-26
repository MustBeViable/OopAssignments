import java.util.ArrayList;
import java.util.List;

public class ShapeCalculator {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(5, "Red"));
        shapes.add(new Rectangle(3,8, "Green"));
        shapes.add(new Triangle(4,6, "Blue"));

        System.out.println("Shape Calculator\n");


        //Lisäsin super.colorin. Olis voinu viel lisää get metodin ja sillä laittaa loopissa.
        for (Shape s : shapes) {
            s.calculateArea();
            System.out.println(s.toString());
        }
    }

}
