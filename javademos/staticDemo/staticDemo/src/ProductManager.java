public class ProductManager {

    //manager sınıflar ASLA STATİC YAPILMAZ.
    //bir metodu static yaptığınızda class ismi ile çağrılır.
    public void add(Product product){
        ProductValidator validator = new ProductValidator();
        if (ProductValidator.isValid(product)){
            System.out.println("Eklendi");
        }else {
            System.out.println("Ürün bilgileri hatalı.");
        }


    }
}
