package KalemTuruModelleme;

class MarkerKalem extends DolanKalemler {
    public MarkerKalem(String renk) {
        super(renk);
    }

    @Override
    public void boyaDoldur() {
        System.out.println("Marker Kalem için boya dolduruldu.");
    }

    @Override
    public String toString() {
        return "Marker Kalem - " + super.toString();
    }
}
