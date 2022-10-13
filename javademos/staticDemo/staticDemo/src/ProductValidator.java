public class ProductValidator {

    static {
        System.out.println("Static yapıcı blok çalıştı");
    }
    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı");
    }
    public static boolean isValid(Product product){
        //isEmpty : değer girilmedi anlamına gelir
        //!product.name.isEmpty : isEmpty yani değer girilmediyse manasında kullanılır. '!' işareti koda "değilse" anlamını katar.
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
    public void xopersayonu(){

    }

}
