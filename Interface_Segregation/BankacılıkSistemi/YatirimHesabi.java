package BankacılıkSistemi;
import java.util.ArrayList;
import java.util.List;

public class YatirimHesabi implements Hesap, ParaCekme, ParaYatirma, YatirimYapma {
    private String hesapNo;
    private double bakiye;
    private List<String> yatirimlar;

    public YatirimHesabi(String hesapNo, double bakiye) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.yatirimlar = new ArrayList<>();
    }

    @Override
    public void paraCek(double miktar) {
        if (miktar <= bakiye) {
            bakiye -= miktar;
            System.out.println(miktar + " TL çekildi. Yeni bakiye: " + bakiye + " TL.");
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    @Override
    public void paraYatir(double miktar) {
        bakiye += miktar;
        System.out.println(miktar + " TL yatırıldı. Yeni bakiye: " + bakiye + " TL.");
    }

    @Override
    public void yatirimYap(double miktar) {
        if (miktar <= bakiye) {
            bakiye -= miktar;
            yatirimlar.add(miktar + " TL'lik yatırım yapıldı.");
            System.out.println(miktar + " TL yatırım yapıldı. Yeni bakiye: " + bakiye + " TL.");
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    public void yatirimlariGoster() {
        if (yatirimlar == null || yatirimlar.isEmpty()) {
            System.out.println("Yatırım yapılmamış.");
            return;
        }else{
            System.out.println("Yatırımlar:");
            for (String yatirim : yatirimlar) {
                System.out.println("- " + yatirim);
            }
        }
    }

    @Override
    public String getHesapNo() {
        return hesapNo;
    }

    @Override
    public double getBakiye() {
        return bakiye;
    }

    @Override
    public void hesapBilgileriniGoster() {
        System.out.println("Yatırım Hesabı - Hesap No: " + hesapNo + ", Bakiye: " + bakiye + " TL");
        yatirimlariGoster();
    }
}
