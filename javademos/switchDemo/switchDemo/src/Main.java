public class Main {
    public static void main(String[] args) {
        char grade = 'C';
        //"char" değişken tanımlanamaya yarar. Bu örnekte bir sınav sistemi gösterildi.
        //"case" şart bloğudur, "switch" blokları ile dallandırma yapılır. Yani seçenekler konulur ve
        //seçilen seçeneğe göre bilgisayar belirtilen yanıtı verir
        switch (grade){
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B' :
                System.out.println("İyi : Geçtiniz");
                break;
            case 'C' :
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'D' :
                System.out.println("Geçtiniz");
                break;
            case 'F' :
                System.out.println("Ders Tekrarı");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");
        }
    }
}