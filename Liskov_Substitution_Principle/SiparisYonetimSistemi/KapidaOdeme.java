public class KapidaOdeme implements Odeme {
    @Override
    public void odemeYap(double miktar) {
        System.out.println("Kapıda ödeme ile " + miktar + " TL ödeme alındı.");
    }
}
