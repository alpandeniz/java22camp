package oppWithNLayeredApp.business;

import java.util.List;

import oppWithNLayeredApp.core.logging.Logger;
import oppWithNLayeredApp.dataAccess.HibernateProductDao;
import oppWithNLayeredApp.dataAccess.ProductDao;
import oppWithNLayeredApp.entities.Product;



public class ProductManager {
	
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.loggers = loggers;
		this.productDao = productDao;
	}



	public void add(Product product) throws Exception { 
		//business rules
		if(product.getUnitPrice()<10) {
			throw new Exception("Düzgün fiyat gir it");
		}
		

	 productDao.add(product);
	 
	 for (Logger logger : loggers) {//[database logger, mail loger]
		logger.log(product.getName());
	}
		
		
	}

}