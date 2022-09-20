public class Main {
    public static void main(String[] args) {
        int stock = 15354;
        if (stock > 50000){
            System.out.println("Stok yeterli");
        } else if (stock < 91345){
            System.out.println("Yetersiz stok, sipariş vermek ister misin?");
        }else
        {
            System.out.println("Bir hata oluştu.");

        }
    }
}