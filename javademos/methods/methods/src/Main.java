public class Main {
    public static void main(String[] args) {
        //java'da kod main'den çalışır ve dallanır. Eğer main içerisinde çalışması istenen kod
        //yazılmadıysa hiç bir şekilde çalışmaz. Bir methodu çağırmak için o methodun ismini
        //aşağıda ki gibi yazmak yeterlidir.
        numberFounder();

    }

    public  static void numberFounder(){
        int[] numbers = new int[]{1,2,5,7,9,0};
        int search = 5;
        boolean iHave =false;

        for (int number : numbers){
            if (number==search){
                iHave= true;
                break;
            }
        }
        if (iHave){
            mesajVer("Sayi mevcut: "+ search);
        }
        else {
            mesajVer("Sayi mevcut değildir: "+ search);
        }
    }

    //burada yeni bir fonksiyon tanımladık mesajVer adında. ve üst kısımda bulundan if else bloklarınada yerleştirdik
    // bu tanımladığımız fonksiyonu System.out.println komutu yerine kullanabiliriz.
    public static void  mesajVer(String message){
        System.out.println(message );
    }
}