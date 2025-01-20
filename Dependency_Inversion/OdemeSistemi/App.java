package OdemeSistemi;

public class App {
    public static void main(String[] args) {
      
        OdemeYontemi odemeYontemi = new KrediKartıOdeme();  
        OdemeServisi odemeServisi = new OdemeServisi(odemeYontemi);

        odemeServisi.odemeYap(500.0);

        odemeYontemi = new PayPalOdeme();  
        odemeServisi = new OdemeServisi(odemeYontemi);
        odemeServisi.odemeYap(200.0);
    }
}
