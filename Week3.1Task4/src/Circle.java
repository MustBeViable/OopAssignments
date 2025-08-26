public class Circle extends Shape {

    private double radius;

    public Circle (double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea () {
        super.area = Math.PI * Math.pow(radius, 2);
        return super.area;
    }

    @Override
    public String toString() {
        return "Area of Circle with radius " + this.radius + ": " + super.area
                + " Color: " + super.color;
    }

}
