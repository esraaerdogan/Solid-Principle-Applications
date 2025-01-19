package Single_Responsibility.OtelRezervasyonSistemi;

public class RezervasyonCiktiAlici {
    public void rezervasyonCiktiAl(Rezervasyon rezervasyon) {
        System.out.println("Rezervasyon Detayları:");
        System.out.println("Otel Adı: " + rezervasyon.getOtelAdi());
        System.out.println("Başlangıç Tarihi: " + rezervasyon.getBaslangicTarihi());
        System.out.println("Bitiş Tarihi: " + rezervasyon.getBitisTarihi());
        System.out.println("Kişi Sayısı: " + rezervasyon.getKisiSayisi());
        System.out.println("Rezervasyon ID: " + rezervasyon.getRezervasyonID());
    }
}
