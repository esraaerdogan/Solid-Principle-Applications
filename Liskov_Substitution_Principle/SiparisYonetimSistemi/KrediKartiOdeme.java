public class KrediKartiOdeme implements Odeme {
    @Override
    public void odemeYap(double miktar) {
        System.out.println("Kredi kartı ile " + miktar + " TL ödeme yapıldı.");
    }
}
