public class Main {
    public static void main(String[] args) {
    String message = sehirVer();
    //substring komutu değer döndürür.
    String newMessage = message.substring(0,2);
    System.out.println(newMessage);
    int number = topla(5,7);
    System.out.println(number);
    int toplam = topla2(1,2,3,4,5,6,7,8,9,10);
    System.out.println(toplam);
    }
    /*
    Bir kaç fonksiyon örneği;
     */
    public static void add(){
    System.out.println("Eklendi.");
    }
    //void - bir şeyi yaptırmaya yarar
    public static void delete(){
    System.out.println("Sildin.");
    }
    //println komutu ekrana bi yazı yazar.
    public static void update(){
    System.out.println("Güncellendi.");
    }
    public static int topla(int number1, int number2) {
        return number2-number1;
    }
    public static int topla2(int... numbers){
    int toplam=0;
        for (int number: numbers) {
            toplam+=number;
        }
        return toplam;
    }
    public static String sehirVer(){
        return "Ankara";
    }
}