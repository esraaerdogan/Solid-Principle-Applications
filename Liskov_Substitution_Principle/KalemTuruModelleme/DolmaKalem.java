package KalemTuruModelleme;

class DolmaKalem extends DolanKalemler {
    public DolmaKalem(String renk) {
        super(renk);
    }

    @Override
    public void boyaDoldur() {
        System.out.println("Dolma Kalem için mürekkep dolduruldu.");
    }

    @Override
    public String toString() {
        return "Dolma Kalem - " + super.toString();
    }
}
