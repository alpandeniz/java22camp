public class Main {
    public static void main(String[] args) {

    KrediUI krediUI = new KrediUI();
    //spagetti kod yani karman çorman kod yazmamak için böyle düzenli bir yol izledik. Yani tüm kredileri basekredi'ye ve onuda
    //KrediUI dosyamıza bağladık. Böylece altta ki örneklerde ki gibi rahat ve temiz şekilde kullanabiliyoruz.
    krediUI.KrediHesapla(new KonutKrediManager());
    krediUI.KrediHesapla(new AskerKrediManager());
    }
}