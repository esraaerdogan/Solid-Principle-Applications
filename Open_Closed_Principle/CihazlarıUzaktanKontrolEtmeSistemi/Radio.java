public class Radio implements RemoteControlInterface {
    
    @Override
    public void on() {
        System.out.println("Radio is turned ON");
    }

    @Override
    public void off() {
        System.out.println("Radio is turned OFF");
    }
}