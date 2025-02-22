import java.util.ArrayList;
import java.util.List;

public class MsSqlMateryal implements IDBMateryal {

    private List<Materyal> materyaller = new ArrayList<>();

    @Override
    public void materyalEkle(Materyal materyal) {
        materyaller.add(materyal);
        System.out.println(materyal.getMateryalAdi() + " eklendi.");
    }

    @Override
    public void materyalSil(Materyal materyal) {
        if (materyaller.remove(materyal)) {
            System.out.println(materyal.getMateryalAdi() + " silindi.");
        } else {
            System.out.println(materyal.getMateryalAdi() + " bulunamadı!");
        }
    }

    @Override
    public void materyalAra(String materyalAdi) {
        for (int i = 0; i < materyaller.size(); i++) {
            if (materyaller.get(i).getMateryalAdi().equalsIgnoreCase(materyalAdi)) {
                System.out.println("Materyal bulundu! Index: " + i);
                return;
            }
        }
        System.out.println("Materyal bulunamadı.");
    }
}
