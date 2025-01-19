public class TV implements RemoteControlInterface {
    
    @Override
    public void on() {
        System.out.println("TV is turned ON");
    }

    @Override
    public void off() {
        System.out.println("TV is turned OFF");
    }
}