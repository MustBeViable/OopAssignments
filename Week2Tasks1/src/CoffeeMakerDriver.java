import java.util.Objects;

public class CoffeeMakerDriver {

    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        int testTimes = 10; //set the test times here
        for (int i = 0; i < testTimes; i++) {
            if (!coffeeMaker.isItOn()) {
                coffeeMaker.pressOnOff();
            }
            System.out.println("Coffee maker is " + coffeeMaker.getIsOnText());

            if (Objects.equals(coffeeMaker.getCoffeeType(), "espresso")) {
                coffeeMaker.setCoffeeType("normal coffee");
            } else {
                coffeeMaker.setCoffeeType("espresso");
            }

            System.out.println("Coffee type is " + coffeeMaker.getCoffeeType());
            System.out.println("Coffee amount is " + coffeeMaker.getCoffeeVolume() + " ml");

            coffeeMaker.setCoffeeVolume((coffeeMaker.getCoffeeVolume() + 10));

            coffeeMaker.pressOnOff();
            System.out.println("Coffee maker is " + coffeeMaker.getIsOnText());
        }
    }
}
