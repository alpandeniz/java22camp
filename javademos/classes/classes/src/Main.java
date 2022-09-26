public class Main {
    public static void main(String[] args) {
        //classlar referans tiplerdir -- Bir classı kullanabilmek için onu "new" ile çalıştırmak zorunludur.
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2= new CustomerManager();
        //altta bulunan komut ile artık iki classı Heap'e yönlendirdik
        customerManager = customerManager2;

        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
    }



}

