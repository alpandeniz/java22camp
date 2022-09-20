public class Main {
    public static void main(String[] args) {
       int number = 6;
       int toplam =0;
               int[] mukemmelsayi = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28};
       for (int i=1; i<mukemmelsayi.length;i++)
       {
           if (number%i == 0 && mukemmelsayi[i]<=number)
           {
               toplam = toplam+i;
           }
       }
       if (toplam==number)
       {
           System.out.println("Mükkemmel sayı seçtiniz.");
       }
       else
       {
           System.out.println("Yanlış seçim.");
       }

    }
}