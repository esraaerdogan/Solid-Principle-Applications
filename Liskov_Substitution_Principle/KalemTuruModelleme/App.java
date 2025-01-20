package KalemTuruModelleme;

public class App {
    public static void main(String[] args) {
        // LSP'ye uygun olarak tüm türetilmiş sınıflar ana sınıf yerine kullanılabilir.
        Kalem kursunKalem = new KursunKalem("Siyah");
        Kalem markerKalem = new MarkerKalem("Kırmızı");
        Kalem dolmaKalem = new DolmaKalem("Mavi");

        System.out.println(kursunKalem);
        System.out.println(markerKalem);
        System.out.println(dolmaKalem);

        // Dolan Kalemler'e özel metodları çağırma
        DolanKalemler dolanMarker = new MarkerKalem("Yeşil");
        dolanMarker.boyaDoldur();

        DolanKalemler dolanDolmaKalem = new DolmaKalem("Lacivert");
        dolanDolmaKalem.boyaDoldur();
    }
}
