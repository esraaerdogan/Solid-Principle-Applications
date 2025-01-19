public class CDPlayer implements RemoteControlInterface {
   
    @Override
    public void on() {
        System.out.println("CD Player is turned ON");
    }

    @Override
    public void off() {
        System.out.println("CD Player is turned OFF");
    }
}