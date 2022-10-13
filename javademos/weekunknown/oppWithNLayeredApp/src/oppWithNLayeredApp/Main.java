package oppWithNLayeredApp;

import oppWithNLayeredApp.business.ProductManager;
import oppWithNLayeredApp.core.logging.DatabaseLogger;
import oppWithNLayeredApp.core.logging.FileLogger;
import oppWithNLayeredApp.core.logging.Logger;
import oppWithNLayeredApp.dataAccess.HibernateProductDao;
import oppWithNLayeredApp.dataAccess.JdbcProductDao;
import oppWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Product product1 = new Product(1, "IPhone XR", 9000);
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);
	}

}
