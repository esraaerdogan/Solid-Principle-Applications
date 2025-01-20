package MusteriYonetimi;
import java.util.ArrayList;
import java.util.List;

public class VeritabaniMusteriIslemleri implements MusteriIslemleri {
    private List<Musteri> musteriler = new ArrayList<>();

    @Override
    public void musteriEkle(Musteri musteri) {
        System.out.println("Müşteri veritabanına ekleniyor: ");
        musteriler.add(musteri);
    }

    @Override
    public void musteriGetir(int id) {
        System.out.println("Müşteri bilgileri veritabanından getiriliyor: " + id);
    }

    @Override
    public List<Musteri> tumMusterileriGoruntule() {
        return musteriler;
    }
}
