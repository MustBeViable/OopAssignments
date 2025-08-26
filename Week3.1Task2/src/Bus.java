public class Bus extends Car {

    private int passangerCount = 0;

    public Bus (String typeName, double speed, double gasolineTankCapacity,
                double gasolineLevel) {
        super(typeName, speed, gasolineTankCapacity,gasolineLevel);
    }

    public void passangerEnter() {
        this.passangerCount += 1;
    }

    public void passangerExit() {
        this.passangerCount = Math.max(0, this.passangerCount-1);
    }

}
