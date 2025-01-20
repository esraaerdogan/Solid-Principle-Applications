package OdemeSistemi;

public class KrediKartıOdeme implements OdemeYontemi {
    @Override
    public void odemeyiIsle(double tutar) {
        System.out.println("Ödeme Kredi Kartı ile işleniyor: " + tutar + " TL");
    }
}