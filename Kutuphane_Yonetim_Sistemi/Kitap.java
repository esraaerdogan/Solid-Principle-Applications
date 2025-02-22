public class Kitap extends Materyal {
    private String isbNo;
    private String kitaplikKodu;
    
    public String getIsbNo() {
        return isbNo;
    }
    public void setIsbNo(String isbNo) {
        this.isbNo = isbNo;
    }
    public String getKitaplikKodu() {
        return kitaplikKodu;
    }
    public void setKitaplikKodu(String kitaplikKodu) {
        this.kitaplikKodu = kitaplikKodu;
    }
}