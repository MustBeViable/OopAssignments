public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle (double width, double height, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea () {
        super.area = this.width * this.height;
        return super.area;
    }

    @Override
    public String toString() {
        return "Area of Rectangle with width " + this.width + " and height " + this.height + ": " + super.area
                + " Color: " + super.color;
    }
}