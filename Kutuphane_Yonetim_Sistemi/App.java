public class App{
    public static void main(String[] args) {

        /*
         *  Bu projede yeni kullanıcı ekleme, kullanıcı silme ve arama; 
         *  yeni materyal ekleme, materyal silme ve arama işlemleri yapılmıştır.
         *  
         *  Materyaller: kitap, e-kitap 
         *  Kitap: Materyal Tipi, Materyal adı, ISBN no, kitaplık kodu. 
         *  E-kitap: Materyal Tipi, Materyal adı, e-kitap web adresi.
         * 
         *  Kullanıcılar: öğrenci, yönetici
         *  Öğrenci: Kullanıcı adı, ad soyad, okul no, kullanici_turu  
         *  Yönetici: Kullanıcı adı, ad soyad, sicil no, kullanici_turu 
         */

        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.kullaniciBilgileriGir("ahmet123", "Ahmet Yılmaz", "Ogrenci", "196");
        
        Ogrenci ogrenci2 = new Ogrenci();
        ogrenci2.kullaniciBilgileriGir("zehra123", "Zehra Çelik", "Ogrenci", "254");

        Yonetici yonetici1 = new Yonetici();
        yonetici1.kullaniciBilgileriGir("admin1", "Mehmet Kaya", "Yonetici" , "SIC12345");

        Yonetici yonetici2 = new Yonetici();
        yonetici2.kullaniciBilgileriGir("zeyneptas", "Zeynep Tas", "Yonetici" , "A0C1T385");

        IDBKullanici kullanici = new MsSqlKullanici();

        kullanici.kullaniciEkle(ogrenci1);
        kullanici.kullaniciEkle(ogrenci2);
        kullanici.kullaniciEkle(yonetici1);
        kullanici.kullaniciEkle(yonetici2);

        Kitap kitap1 = new Kitap();
        kitap1.setMateryalAdi("Suc ve Ceza");
        kitap1.setMateryalTipi("Kitap");
        kitap1.setIsbNo("124537");
        kitap1.setKitaplikKodu("ST-245");
        
        Kitap kitap2 = new Kitap();
        kitap2.setMateryalAdi("Fareler ve İnsanlar");
        kitap2.setMateryalTipi("Kitap");
        kitap2.setIsbNo("654792");
        kitap2.setKitaplikKodu("AT-105");

        EKitap eKitap1 = new EKitap();
        eKitap1.setMateryalAdi("Toprak Ana");
        eKitap1.setMateryalTipi("E-Kitap");
        eKitap1.seteKitapWebAdresi("www.toprakana.com");

        EKitap eKitap2 = new EKitap();
        eKitap2.setMateryalAdi("İçimizdeki Şeytan");
        eKitap2.setMateryalTipi("E-Kitap");
        eKitap2.seteKitapWebAdresi("www.icimizdekiseytan.com");

        IDBMateryal materyal = new MsSqlMateryal();

        materyal.materyalEkle(kitap1);
        materyal.materyalEkle(kitap2);
        materyal.materyalEkle(eKitap1);
        materyal.materyalEkle(eKitap2);

        kullanici.kullaniciAra("admin1");
        kullanici.kullaniciSil(ogrenci2);

        materyal.materyalAra("İçimizdeki Şeytan");
        materyal.materyalSil(kitap2);
        
    }
}