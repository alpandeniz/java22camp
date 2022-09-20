public class Main {
    public static void main(String[] args) {
       //for(döngüler), "i++" = i değerini tek tek arttır demektir. "i--" i değerini tek tek azalt.
        // örn. i+=2 , i değerini 2 arttır demektir. Bu değeri kişisel tercihe göre ayarlamak mümkün.
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("'For' Döngüsü tamamlandı");
        //bir değişken sadece yazıldığı blokta geçerlidir.(Yani hemen sonra gelen süslü parantez karşılar)
        //Süslü parantez{} kapandıktan sonra o değişken tekrar kullanılacak ise tekrar tanımlanmalıdır.
        //while döngüsü for komutu ile aynı işlevi görür ama genellikle for tercih edilir.
        int i=1;
        while(i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("While Döngüsü bitti");

            //Do-While döngüsü
        int j=3;
        do{
            System.out.println(j);
            j+=5;

        }while(j<28);
        System.out.println("Do-While döngüsü çalıştı");

    }
}