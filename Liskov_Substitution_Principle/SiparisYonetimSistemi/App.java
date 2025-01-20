public class App {
    public static void main(String[] args) {

        // Ürün oluşturma
        Urun kitap1 = new Kitap("Java Programlama Kitabı", 50.0);
        Urun elektronik1 = new Elektronik("Kulaklık", 150.0);

        // Ödeme yöntemi, kargo şirketi seçme
        Odeme krediKartiOdeme = new KrediKartiOdeme();
        Kargo arasKargo = new ArasKargo();

        // Sipariş oluşturma
        Siparis siparis = new Siparis(krediKartiOdeme, arasKargo);

        // Ürünleri sepete ekleme
        siparis.urunEkle(kitap1);
        siparis.urunEkle(elektronik1);

        siparis.siparisiTamamla("İstanbul, Kadıköy");

    }
}