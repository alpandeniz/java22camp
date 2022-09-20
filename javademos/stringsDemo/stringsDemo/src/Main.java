public class Main {
    public static void main(String[] args) {
        String message = "   BaşaRdın!   ";


        System.out.println(message);
//.length komutu ile değişkende bulunan karakterlerin toplamı öğrenilebilir
        // .charAt komutu genellikle bir metinde bulunan karakterde ki belirtilen değeri yakalamanızı sağlar
        System.out.println("Karakter sayısı : " + message.length());
        System.out.println("5. Karakter : " + message.charAt(4));
        //.concat komutu belirtilecek metni birleştirir. Alt kısımda örnek mevcut.
        System.out.println(message.concat(" Tebrikler."));
        //.startsWith komutu sadece true veya false döndürür. Altta ki örnek "metin 'B' ile başlıyor mu demektir"
        System.out.println(message.startsWith("B"));
        //.startsWith komutu sadece true veya false döndürür. Altta ki örnek "metin '!' ile bitiyor mu demektir"
        System.out.println(message.endsWith("!"));
        //.getChars komutu ise metinde belirtilen aralıktaki karakterleri siler.
        //char[] characters = new char[5];     !!BU KISIM DÜZGÜN ÇALIŞMADI TEKRAR ARAŞTIR
        //message.getChars(0, 5,0);            !!BU KISIM DÜZGÜN ÇALIŞMADI TEKRAR ARAŞTIR
       // System.out.println(characters);      !!BU KISIM DÜZGÜN ÇALIŞMADI TEKRAR ARAŞTIR
        //.indexOf komutu belirtilen metin içindeki karakterin kaçıncı sırada bulunduğunu belirtir.
        //Sadece ilk bulduğu karakteri belirtir ve aramayı bitirir. Aynı şekilde char yani 'a', olarak değilde
        //string yani "aş" şeklinde aratsaydık metin içinde ilk bulduğu "aş" karakterlerini bize verecektir.
       // aynı şekilde .lastIndexOf komutuda aynı işlemi sağdan başlayarak yapar.
       System.out.println(message.indexOf('a'));
        System.out.println(message.lastIndexOf('r'));
        //.replace belirtilen metinde ki belirtilen karakterleri değiştirir.
        String newMessage = message.replace('!', '.');
        System.out.println(newMessage);
        //.substring belirtilen değişkeni kaçıncı karakterden itibaren yazacağını belirtir.
        System.out.println(message.substring(1));
        //.split fonksiyonu bir metni belli bir karakter ya da karakter dizisini dikkate olarak parçalamaya yarar.
       for (String kelime: message.split("a")){
           System.out.println(kelime);
       }
       //.toLowerCase belirtilen değişkendeki bütün harfleri küçültür.
       System.out.println(message.toLowerCase());
       //.toUpperCase belirtilen değişkendeki bütün harfleri büyütür.
        System.out.println(message.toUpperCase());

        //.trim değişkenin başı ve sonundaki boşlukları atar
        System.out.println(message.trim());
    }
}