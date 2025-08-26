public class Car {

    private double speed;
    private double gasolineLevel;
    private String typeName;
    private double tankCapacity;


    public Car(String typeName, double speed, double gasolineTankCapacity, double gasolineLevel) {
        this.typeName = typeName;
        this.speed = speed;
        this.tankCapacity = gasolineTankCapacity;
        this.gasolineLevel = gasolineLevel;
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    protected void consumeFuel(double amount) {
        if (this.gasolineLevel <= 0 || amount <= 0) {
            this.gasolineLevel = 0;
        }
        this.gasolineLevel = Math.max(0, this.gasolineLevel - amount);
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