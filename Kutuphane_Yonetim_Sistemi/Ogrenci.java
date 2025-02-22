public class Ogrenci extends Kullanici{
    private String okulNo;

    public String getOkulNo() {
        return okulNo;
    }

    @Override
    public void kullaniciBilgileriGir(String kullaniciAdi, String adSoyad, String kullanici_turu, String no) {
        this.okulNo = no;
        setKullaniciAdi(kullaniciAdi);
        setAdSoyad(adSoyad);
        setKullanici_turu(kullanici_turu);
    }   
}