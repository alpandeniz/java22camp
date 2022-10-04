public class Main {

    public static void main(String[] args) {

    CustomerManager customerManager = new CustomerManager();
    customerManager.managerofthebase = new OracleDatabaseManager();
    customerManager.getCustomers();

    }
}