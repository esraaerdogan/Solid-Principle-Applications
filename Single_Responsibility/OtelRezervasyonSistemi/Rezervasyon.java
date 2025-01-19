package Single_Responsibility.OtelRezervasyonSistemi;

public class Rezervasyon {
    private String baslangicTarihi;
    private String bitisTarihi;
    private int kisiSayisi;
    private String otelAdi;
    private String rezervasyonID;

    public Rezervasyon(String baslangicTarihi, String bitisTarihi, int kisiSayisi, String otelAdi, String rezervasyonID) {
        this.baslangicTarihi = baslangicTarihi;
        this.bitisTarihi = bitisTarihi;
        this.kisiSayisi = kisiSayisi;
        this.otelAdi = otelAdi;
        this.rezervasyonID = rezervasyonID;
    }

    public String getBaslangicTarihi() { return baslangicTarihi; }
    public void setBaslangicTarihi(String baslangicTarihi) { this.baslangicTarihi = baslangicTarihi; }

    public String getBitisTarihi() { return bitisTarihi; }
    public void setBitisTarihi(String bitisTarihi) { this.bitisTarihi = bitisTarihi; }

    public int getKisiSayisi() { return kisiSayisi;} 
    public void setKisiSayisi(int kisiSayisi) { this.kisiSayisi = kisiSayisi; }

    public String getOtelAdi() { return otelAdi; }
    public void setOtelAdi(String otelAdi) { this.otelAdi = otelAdi; }

    public String getRezervasyonID() { return rezervasyonID; }
    public void setRezervasyonID(String rezervasyonID) { this.rezervasyonID = rezervasyonID;}
}