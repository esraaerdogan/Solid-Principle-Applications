package MusteriYonetimi;
import java.util.List;

public interface MusteriIslemleri  {
    void musteriEkle(Musteri musteri);
    void musteriGetir(int id);
    List<Musteri> tumMusterileriGoruntule();
}