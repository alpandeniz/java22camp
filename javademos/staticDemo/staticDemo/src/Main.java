public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        Product product = new Product();
        product.name = "Clio 2020";
        product.price = 359.999;
        product.id = 1;
        productManager.add(product);
    }
}