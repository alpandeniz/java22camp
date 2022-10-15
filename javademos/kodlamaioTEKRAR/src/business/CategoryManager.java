package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private final List<Category> categories;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		this.categories = categories;
		this.loggers = loggers;
		this.categoryDao = categoryDao;
	}
	
	
	public void add(Category category) throws Exception {
		for(Category categories : categories) {
			if(categories.getCategoryName() == category.getCategoryName()) {
				throw new Exception ("Bu kategori zaten var, lütfen farklı bir isim kullanınız.");
			}
		}
		categoryDao.add(category);
		categories.add(category);
		for(Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
}
