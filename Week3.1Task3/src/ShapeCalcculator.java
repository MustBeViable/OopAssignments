import java.util.ArrayList;
import java.util.List;

public class ShapeCalcculator {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(3,8));
        shapes.add(new Triangle(4,6));

        System.out.println("Shape Calculator\n");

        for (Shape s : shapes) {
            s.calculateArea();
            System.out.println(s.toString());
        }
    }

}
