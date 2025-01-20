package KalemTuruModelleme;

class KursunKalem extends DolmayanKalemler {
    public KursunKalem(String renk) {
        super(renk);
    }

    @Override
    public String toString() {
        return "Kurşun Kalem - " + super.toString();
    }
}
