package MusteriYonetimi;
import java.util.List;

public class MusteriYonetimi {
    private MusteriIslemleri musteriIslemleri;

    public MusteriYonetimi(MusteriIslemleri musteriIslemleri) {
        this.musteriIslemleri = musteriIslemleri;
    }

    public void musteriEkle(Musteri musteri) {
        musteriIslemleri.musteriEkle(musteri);
    }

    public void musteriGetir(int id) {
        musteriIslemleri.musteriGetir(id);
    }

    public List<Musteri> tumMusterileriGoruntule() {
        return musteriIslemleri.tumMusterileriGoruntule();
    }
}