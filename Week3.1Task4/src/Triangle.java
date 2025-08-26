public class Triangle extends Shape{

    private double base;
    private double height;

    public Triangle (double base, double height, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea () {
        super.area = (this.base * this.height) / 2;
        return super.area;
    }

    @Override
    public String toString() {
        return "Area of Triangle with base " + this.base + " and height " + this.height + ": " + super.area
                + " Color: " + super.color;
    }

}
