package Single_Responsibility.OtelRezervasyonSistemi;

import java.util.List;

public class App {
    public static void main(String[] args) {
        OtelAramaci aramaci = new OtelAramaci();

        Tedarikci t1 = new Tedarikci1();
        Tedarikci t2 = new Tedarikci2();

        aramaci.tedarikciEkle(t1);
        aramaci.tedarikciEkle(t2);

        // Otel arama
        List<Otel> oteller = aramaci.otelAra("Hilton");

        for (Otel otel : oteller) {
            System.out.println("Otel: " + otel.getOtelAdi() + ", Tedarikçi: " + otel.getTedarikciId() + ", Ücret: " + otel.getUcret());
        }

        // Rezervasyon yapma
        RezervasyonYapici yapici = new RezervasyonYapici();
        Rezervasyon rezervasyon = yapici.rezervasyonYap("2024-11-20", "2024-11-25", 2, "Hilton");

        // Rezervasyon çıktısı alma
        RezervasyonCiktiAlici ciktiAlici = new RezervasyonCiktiAlici();
        ciktiAlici.rezervasyonCiktiAl(rezervasyon);
    }
}
