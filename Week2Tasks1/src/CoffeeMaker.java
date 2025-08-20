public class CoffeeMaker {
    private String coffeeType;
    private int coffeeVolume = 10;
    private boolean isOn = false;
    private String isOnText = "off";

    public boolean isItOn() {
        return this.isOn;
    }

    public String getIsOnText() {
        return this.isOnText;
    }

    public void pressOnOff() {
        if (!this.isOn) {
            this.isOnText = "on";
        } else {
            this.isOnText = "off";
        }
        this.isOn = !this.isOn;
    }

    public void setCoffeeType(String type) {
        if (this.isOn) {
            this.coffeeType = type;
        }
    }

    public String getCoffeeType() {
        return this.coffeeType;
    }

    public void setCoffeeVolume(int volume) {
        if (this.isOn) {
            if (volume > 80) {
                volume = 10;
            }
            this.coffeeVolume = volume;
        }
    }

    public int getCoffeeVolume() {
        return this.coffeeVolume;
    }
}
