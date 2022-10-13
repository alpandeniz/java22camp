public class Main {
    public static void main(String[] args) {

            //ICustomerDal iCustomerDal = new OracleCustomerDal();
            CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());

            customerManager.add();
        }

    }
