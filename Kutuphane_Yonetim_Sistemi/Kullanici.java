public abstract class Kullanici implements IKullanici{

    private String kullaniciAdi;
    private String adSoyad;
    private String kullanici_turu;

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }
    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }
    public String getAdSoyad() {
        return adSoyad;
    }
    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }
    public String getKullanici_turu() {
        return kullanici_turu;
    }
    public void setKullanici_turu(String kullanici_turu) {
        this.kullanici_turu = kullanici_turu;
    }
}