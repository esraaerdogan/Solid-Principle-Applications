public class YurticiKargo implements Kargo {
    @Override
    public void kargoyaVer(String adres) {
        System.out.println("Yurtiçi Kargo ile " + adres + " adresine gönderim yapıldı.");
    }
}
