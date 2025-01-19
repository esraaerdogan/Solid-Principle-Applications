package Single_Responsibility.OtelRezervasyonSistemi;

public class Tedarikci1 implements Tedarikci {
    @Override
    public Otel otelAra(String otelAdi) {
        // Tedarikçi1 otel arama işlemi
        System.out.println("Tedarikçi1 üzerinden otel aranıyor: " + otelAdi);
        return new Otel(otelAdi, "Tedarikci1", 500.0);
    }
}