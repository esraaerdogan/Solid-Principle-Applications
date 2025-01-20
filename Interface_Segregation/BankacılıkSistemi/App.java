package BankacılıkSistemi;

public class App {
    public static void main(String[] args) {
        TasarrufHesabi tasarrufHesabi = new TasarrufHesabi("12345", 1000);
        YatirimHesabi yatirimHesabi = new YatirimHesabi("67890", 5000);
        KurumsalHesap kurumsalHesap = new KurumsalHesap("11223", 10000);

        tasarrufHesabi.hesapBilgileriniGoster();
        yatirimHesabi.hesapBilgileriniGoster();
        kurumsalHesap.hesapBilgileriniGoster();

        tasarrufHesabi.paraYatir(500);
        yatirimHesabi.yatirimYap(2000);
        kurumsalHesap.faturaOde("Elektrik", 300);

        tasarrufHesabi.hesapBilgileriniGoster();
        yatirimHesabi.hesapBilgileriniGoster();
        kurumsalHesap.hesapBilgileriniGoster();
    }
}
