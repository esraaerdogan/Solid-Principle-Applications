public class ArasKargo implements Kargo {
    @Override
    public void kargoyaVer(String adres) {
        System.out.println("Aras Kargo ile " + adres + " adresine gönderim yapıldı.");
    }
}