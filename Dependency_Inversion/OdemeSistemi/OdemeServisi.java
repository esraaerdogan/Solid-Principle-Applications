package OdemeSistemi;

public class OdemeServisi {
    private OdemeYontemi odemeYontemi;

    // DIP: Bağımlılık ters çevrildi, OdemeYontemi arayüzüne bağımlı
    public OdemeServisi(OdemeYontemi odemeYontemi) {
        this.odemeYontemi = odemeYontemi;
    }

    public void odemeYap(double tutar) {
        odemeYontemi.odemeyiIsle(tutar);
        System.out.println("Odeme gerceklesti.");
    }
}
