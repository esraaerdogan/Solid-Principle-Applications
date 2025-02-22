public class Yonetici extends Kullanici {
    private String sicilNo;

    public String getSicilNo() {
        return sicilNo;
    }

    @Override
    public void kullaniciBilgileriGir(String kullaniciAdi, String adSoyad, String kullanici_turu, String no) {
        this.sicilNo = no;
        setKullaniciAdi(kullaniciAdi);
        setAdSoyad(adSoyad);
        setKullanici_turu(kullanici_turu);
    }

}