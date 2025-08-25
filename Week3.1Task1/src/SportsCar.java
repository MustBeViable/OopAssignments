public class SportsCar extends Car{
    public SportsCar(String typeName, double speed, double gasolineTankCapacity, double gasolineLevel) {
        super(typeName, speed, gasolineTankCapacity, gasolineLevel);
    }

    @Override
    public void accelerate() {
        if (super.getGasolineLevel() > 0) {
            super.accelerate();
            super.accelerate();
            super.consumeFuel(2.0);
        }
        else {
            super.accelerate();
        }
    }
    @Override
    public void decelerate(int amount) {
        if (super.getGasolineLevel()>0) {
            super.decelerate(amount*2);
        } else {
            super.decelerate(amount);}
    }
}
