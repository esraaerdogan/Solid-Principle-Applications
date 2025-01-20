package OdemeSistemi;

public class PayPalOdeme implements OdemeYontemi {
    @Override
    public void odemeyiIsle(double tutar) {
        System.out.println("Ödeme PayPal ile işleniyor: " + tutar + " TL");
    }
}
