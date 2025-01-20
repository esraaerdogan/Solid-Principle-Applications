package MusteriYonetimi;
public class Musteri {
    private int id;
    private String isim;
    private String email;

    public Musteri(int id, String isim, String email) {
        this.id = id;
        this.isim = isim;
        this.email = email;
    }
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getIsim() { return isim; }
    public void setIsim(String isim) { this.isim = isim; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}