package Single_Responsibility.OtelRezervasyonSistemi;
import java.util.ArrayList;
import java.util.List;

public class OtelAramaci {
    private List<Tedarikci> tedarikciler = new ArrayList<>();

    public void tedarikciEkle(Tedarikci tedarikci) {
        tedarikciler.add(tedarikci);
    }

    public List<Otel> otelAra(String otelAdi) {
        List<Otel> oteller = new ArrayList<>();
        for (Tedarikci tedarikci : tedarikciler) {
            oteller.add(tedarikci.otelAra(otelAdi));
        }
        return oteller;
    }
}