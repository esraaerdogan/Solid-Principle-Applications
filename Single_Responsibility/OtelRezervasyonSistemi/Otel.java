package Single_Responsibility.OtelRezervasyonSistemi;

public class Otel {
    private String otelAdi;
    private String tedarikciId;
    private double ucret;

    public Otel(String otelAdi, String tedarikciId, double ucret) {
        this.otelAdi = otelAdi;
        this.tedarikciId = tedarikciId;
        this.ucret = ucret;
    }

    public String getOtelAdi() {  return otelAdi; }
    public void setOtelAdi(String otelAdi) { this.otelAdi = otelAdi; }

    public String getTedarikciId() { return tedarikciId; }
    public void setTedarikciId(String tedarikciId) { this.tedarikciId = tedarikciId; }

    public double getUcret() { return ucret; }
    public void setUcret(double ucret) { this.ucret = ucret; }
}