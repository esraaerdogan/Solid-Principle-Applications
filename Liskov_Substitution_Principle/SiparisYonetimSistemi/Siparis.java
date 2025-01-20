import java.util.ArrayList;
import java.util.List;

public class Siparis {
    private List<Urun> urunler;
    private Odeme odeme;
    private Kargo kargo;

    public Siparis(Odeme odeme, Kargo kargo) {
        this.urunler = new ArrayList<>();
        this.odeme = odeme;
        this.kargo = kargo;
    }

    public void urunEkle(Urun urun) {
        urunler.add(urun);
        System.out.println(urun.getUrunAdi() + " sepete eklendi.");
    }

    public void siparisiTamamla(String adres) {
        double toplamTutar = urunler.stream().mapToDouble(Urun::getFiyat).sum();
        System.out.println("Toplam tutar: " + toplamTutar + " TL");
        odeme.odemeYap(toplamTutar);
        kargo.kargoyaVer(adres);
        System.out.println("Sipariş tamamlandı!");
    }
}
