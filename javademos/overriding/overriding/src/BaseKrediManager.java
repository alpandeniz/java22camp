public class BaseKrediManager {
    //Burada void yerine double kullanmamızın sebebi burada bir hesap döndürmek istediğimiz içindir.
        /* public final double olarak yazdığım için diğer classlar  "hesapla" komutunu override edemez, yani aynısını yazarak değiştiremez.

              public final double hesapla(double tutar){
       return tutar * 1.35;

   }
         */
    public double hesapla(double tutar){
       return tutar * 1.35;

   }
   public double taksit(double sonuc){
        return sonuc / 24;
    }

}
