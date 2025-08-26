public class Shape {

    protected String color;
    protected double area = 0;

    public Shape(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return this.area;
    }

}