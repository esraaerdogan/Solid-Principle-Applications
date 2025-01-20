public class Elektronik implements Urun {
    
    private String urunAdi;
    private double fiyat;

    public Elektronik(String urunAdi, double fiyat) {
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
    }

    @Override
    public String getUrunAdi() {
        return urunAdi;
    }

    @Override
    public double getFiyat() {
        return fiyat;
    }
}