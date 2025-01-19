public class RemoteControl {
    
    private RemoteControlInterface device;

    public RemoteControl(RemoteControlInterface device) {
        this.device = device;
    }

    public void turnOn() { device.on(); }
    public void turnOff() { device.off(); }
}