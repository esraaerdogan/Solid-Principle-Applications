package BankacılıkSistemi;

public class KurumsalHesap implements Hesap, ParaCekme, ParaYatirma, HavaleYapma, FaturaOdeme {
    private String hesapNo;
    private double bakiye;

    public KurumsalHesap(String hesapNo, double bakiye) {
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
    public void havaleYap(double miktar, Hesap hedefHesap) {
        if (miktar <= bakiye) {
            bakiye -= miktar;
            if (hedefHesap instanceof KurumsalHesap) {
                ((KurumsalHesap) hedefHesap).paraYatir(miktar);
                System.out.println(miktar + " TL havale yapıldı. Yeni bakiye: " + bakiye + " TL.");
            } else {
                System.out.println("Hedef hesap geçerli bir kurumsal hesap değil.");
            }
        } else {
            System.out.println("Yetersiz bakiye, havale yapılamadı!");
        }
    }

    @Override
    public void faturaOde(String faturaTipi, double miktar) {
        if (miktar <= bakiye) {
            bakiye -= miktar;
            System.out.println(faturaTipi + " faturası ödendi. Ödenen tutar: " + miktar + " TL. Yeni bakiye: " + bakiye + " TL.");
        } else {
            System.out.println("Yetersiz bakiye, fatura ödenemedi!");
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
        System.out.println("Kurumsal Hesap - Hesap No: " + hesapNo + ", Bakiye: " + bakiye + " TL");
    }
}
