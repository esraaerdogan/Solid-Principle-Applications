package KalemTuruModelleme;

public abstract class Kalem {
    private String renk;

    public Kalem(String renk) {
        this.renk = renk;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    @Override
    public String toString() {
        return "Kalem Rengi: " + renk;
    }
}