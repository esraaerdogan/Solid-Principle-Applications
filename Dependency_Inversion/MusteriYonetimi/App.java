package MusteriYonetimi;

public class App {
    public static void main(String[] args) {
        
        MusteriIslemleri veritabaniMusteriIslemleri = new VeritabaniMusteriIslemleri();
        
        // DIP: Bağımlılık ters çevrildi, VeritabaniMusteriIslemleri interface'e bağımlıdır
        MusteriYonetimi musteriYonetimi = new MusteriYonetimi(veritabaniMusteriIslemleri);

        Musteri musteri1 = new Musteri(1, "Ahmet Yılmaz", "ahmet.yilmaz@example.com");
        Musteri musteri2 = new Musteri(2, "Ayşe Demir", "ayse.demir@example.com");

        musteriYonetimi.musteriEkle(musteri1);
        musteriYonetimi.musteriEkle(musteri2);

        System.out.println("Tüm Müşteriler:");
        for (Musteri musteri : musteriYonetimi.tumMusterileriGoruntule()) {
            System.out.println("ID: " + musteri.getId() + ", İsim: " + musteri.getIsim() + ", Email: " + musteri.getEmail());
        }

        System.out.println("\nMüşteri Bilgisi (ID: 1):");
        musteriYonetimi.musteriGetir(1);
    }
}
