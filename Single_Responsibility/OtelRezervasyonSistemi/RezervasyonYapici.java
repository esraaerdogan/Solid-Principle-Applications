package Single_Responsibility.OtelRezervasyonSistemi;

public class RezervasyonYapici {
    public Rezervasyon rezervasyonYap(String baslangicTarihi, String bitisTarihi, int kisiSayisi, String otelAdi) {
        String rezervasyonID = "RZV-" + System.currentTimeMillis();
        System.out.println("Rezervasyon oluşturuldu: " + rezervasyonID);
        return new Rezervasyon(baslangicTarihi, bitisTarihi, kisiSayisi, otelAdi, rezervasyonID);
    }
}
