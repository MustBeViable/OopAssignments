public class Motorcycle implements Vehicle{

    final private String type = "Motorcycle";
    final private String fuel = "Petrol";
    private String color;

    public Motorcycle(String color) {
        this.color = color;
    }

    @Override
    public void start() {
        System.out.printf("%s is starting...\n", this.type);
    }

    @Override
    public void stop() {
        System.out.printf("%s is stopping...\n", this.type);
    }

    @Override
    public String getInfo() {
        return this.type +  " Information:\nType: " + this.type + "\nFuel: " + this.fuel + "\nColor: " + this.color;
    }

}
