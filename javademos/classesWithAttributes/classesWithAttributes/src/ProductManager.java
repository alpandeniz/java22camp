public class ProductManager {
     public void Add(Product product){
         //JDBC
         System.out.println("Ürün eklendi " + product.get_name());
     }

     public void Delete(Product product){
         System.out.println("Ürün silindi " + product.get_name());
     }


}
