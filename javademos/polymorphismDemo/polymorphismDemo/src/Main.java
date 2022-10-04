public class Main {
    public static void main(String[] args) {
        //polymorphism = çok biçimlilik demektir. Yani birbirinin referansını tutan referans tiplerdir.(aralarında bir inheritance varsa tabi.)
        //EmailLogger logger = new EmailLogger();
        // DatabaseLogger logger = new DatabaseLogger();
        // logger.Log("Log mesajı");
        // BaseLogger lock = new BaseLogger();
        //lock.Log(" bir şifredir. ");
//        BaseLogger[] loggers = new BaseLogger[]{
//                new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()
//        };
//        for (BaseLogger logger : loggers){
//            logger.Log("Log mesajı");
//        }
    CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
    customerManager.add();

    }

}
