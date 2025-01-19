public class App {
    public static void main(String[] args) {
        // TV kontrolü
        RemoteControlInterface tv = new TV();
        RemoteControl remoteControlForTV = new RemoteControl(tv);
        remoteControlForTV.turnOn();
        remoteControlForTV.turnOff();

        // Radio kontrolü
        RemoteControlInterface radio = new Radio();
        RemoteControl remoteControlForRadio = new RemoteControl(radio);
        remoteControlForRadio.turnOn();
        remoteControlForRadio.turnOff();

        // CD Player kontrolü
        RemoteControlInterface cdPlayer = new CDPlayer();
        RemoteControl remoteControlForCDPlayer = new RemoteControl(cdPlayer);
        remoteControlForCDPlayer.turnOn();
        remoteControlForCDPlayer.turnOff();
    }
}
