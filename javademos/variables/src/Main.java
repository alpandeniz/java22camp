public class Main {
    public static void main(String[] args) {
        // java case sensitive yani büyük küçük harf duyarlı bir dildir bu nedenle "System" büyük harf ile başlar
        int urunSayisi = 10;
        String mesaj = "Ürün Sayısı: ";
        // int kullanarak bir tam sayı, String kullanarak bir metin değişkeni tanımlanabilir.
        // Alttaki gibi tek tek yazmamak için bir int tanımlayarak tek noktadan değişkenler kontrol edilebilir.
        System.out.println(mesaj  + urunSayisi);
        // inti değişkene bağlamak için üsteki örn.
        System.out.println ( mesaj+ urunSayisi);
        System.out.println ( mesaj+ urunSayisi);
        System.out.println ( mesaj+ urunSayisi);
        //reusability : tekrar kullanılabilirlik yani bir sefer yazıp aynı kodu istediğin yerde kullanabilmek.
        //println bir string ve bir sayıyı bir arada kullanmaya izin verir, örn üst kısımda urunSayisi bir sayi iken Ürün Sayım bir stringdir.

    }
}