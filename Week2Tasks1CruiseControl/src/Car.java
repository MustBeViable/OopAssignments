public class Car {

    private double speed;
    private double gasolineLevel;
    private String typeName;
    private double tankCapacity;
    private boolean isCruiseControlOn = false;
    private int maxCruiseSpeed = 120;
    private int minCruiseSpeed = 10;

    public Car(String typeName) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;
    }

    public Car(String typeName, double speed, double gasolineTankCapacity) {
        this.typeName = typeName;
        this.speed = speed;
        this.tankCapacity = gasolineTankCapacity;
    }

    public boolean isCruiseOn() {
        return this.isCruiseControlOn;
    }

    public void setCruiseControlOnOff() {
        this.isCruiseControlOn = !this.isCruiseControlOn;
    }

    public void cruiseFeature(int targetSpeed) {
        if (this.isCruiseOn()) {
            if (this.minCruiseSpeed <= targetSpeed && targetSpeed <= this.maxCruiseSpeed) {
                if (this.getSpeed() < targetSpeed) {
                    while (this.getSpeed() < targetSpeed) {
                        this.accelerate();
                        System.out.println(this.typeName + ": speed is " + this.getSpeed() + " km/h");
                    }
                } else if (this.getSpeed() > targetSpeed) {
                    while (this.getSpeed() > targetSpeed) {
                        this.decelerate(10);
                        System.out.println(this.typeName + ": speed is " + this.getSpeed() + " km/h");
                    }
                }
            } else {
                System.out.println("Invalid speed target. Speed target should be " + this.minCruiseSpeed + " km/h - " +
                        this.maxCruiseSpeed + " km/h");
            }
        } else {
            System.out.println("Cruise feature needs to be turned on!");
            this.setCruiseControlOnOff();
        }
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    double getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = 100;
    }
    double getGasolineLevel() {
        return gasolineLevel;
    }
}