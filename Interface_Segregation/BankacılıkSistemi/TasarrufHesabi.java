package BankacılıkSistemi;

public class TasarrufHesabi implements Hesap, ParaCekme, ParaYatirma {
    private String hesapNo;
    private double bakiye;

    public TasarrufHesabi(String hesapNo, double bakiye) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
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
    public String getHesapNo() {
        return hesapNo;
    }

    @Override
    public double getBakiye() {
        return bakiye;
    }

    @Override
    public void hesapBilgileriniGoster() {
        System.out.println("Tasarruf Hesabı - Hesap No: " + hesapNo + ", Bakiye: " + bakiye + " TL");
    }
}
