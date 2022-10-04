
//abstract bir kod yazacaksak altta ki şekile operasyonunda abstract olduğunu belirtmek zorundayız
public abstract  class GameCalculator {

    //Bu şekilde abstract etmemizde ki amaç kim "calculate" komutunu kullanmak istiyorsa kendi komutunu yazmak zorunda yani override etmek zorunda anlamını içerir.
    //GameCalculator'ı extends eden tüm sınıflar "calculate" operasyonunu içermek zorundadır çünkü kodu abstract olarak yazdım.
    public abstract void calculate();


    //Bu şekilde final yazmamızın sebebi ise gameOver komutunun tek bir sonucu vardır ve override edip değiştirilemez.
    public final void gameOver() {
        System.out.println("Game Over Dude! O:");
    }
}
