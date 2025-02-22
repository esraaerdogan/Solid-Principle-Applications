import java.util.ArrayList;
import java.util.List;

public class MsSqlKullanici implements IDBKullanici{
    private List<Kullanici> kullanicilar = new ArrayList<>();

    @Override
    public void kullaniciEkle(Kullanici kullanici) {
        kullanicilar.add(kullanici);
        System.out.println(kullanici.getKullanici_turu() + " " + kullanici.getKullaniciAdi() + " kullanicisi eklendi.");
    }

    @Override
    public void kullaniciSil(Kullanici kullanici) {
        if (kullanicilar.remove(kullanici)) {
            System.out.println(kullanici.getKullanici_turu() + " " + kullanici.getKullaniciAdi() + " kullanicisi silindi.");
        } else {
            System.out.println(kullanici.getKullanici_turu() + " " + kullanici.getKullaniciAdi() + " kullanicisi bulunamadı.");
        }
    }

    @Override
    public void kullaniciAra(String isim) {
        for (int i = 0; i < kullanicilar.size(); i++) {
            if (kullanicilar.get(i).getKullaniciAdi().equalsIgnoreCase(isim)) {
                System.out.println("Kullanıcı bulundu! Index: " + i);
                return;
            }
        }
        System.out.println("Kullanıcı bulunamadı.");
    }
    

}