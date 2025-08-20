public class CarDriver {
    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla", 0, 60);
        myCar.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        myCar.setCruiseControlOnOff();
        myCar.cruiseFeature(100);
        myCar.cruiseFeature(10);
        myCar.cruiseFeature(150);
        myCar.setCruiseControlOnOff();
        myCar.cruiseFeature(-10);
        myCar.setCruiseControlOnOff();
        myCar.cruiseFeature(100);
        myCar.cruiseFeature(10);
/*
        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
 */
    }
}