public class Television {
    private int channel;
    private boolean isOn = false;

    public boolean isOn () {
        return this.isOn;
    }

    public void pressOnOff() {
        this.isOn = !isOn;  //reverts its value, IDE offered the fix (no AI tool enabled)
    }

    public void setChannel(int newChannel) {
        if (newChannel > 10) {
            this.channel = 1;
        } else {
            this.channel = newChannel;
        }
    }

    public int getChannel() {
       return this.channel;
    }
}
