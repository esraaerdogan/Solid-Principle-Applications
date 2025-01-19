package Single_Responsibility.OtelRezervasyonSistemi;

public class Tedarikci2 implements Tedarikci {
    @Override
    public Otel otelAra(String otelAdi) {
        // Tedarikçi2 otel arama işlemi
        System.out.println("Tedarikçi2 üzerinden otel aranıyor: " + otelAdi);
        return new Otel(otelAdi, "Tedarikci2", 450.0);
    }
}