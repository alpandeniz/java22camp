package entities;



public class Category {
	
	int categoryId;
	String categoryName;
	
	
	
	public Category(int categoryId, String categoryName) {
		this.categoryName = categoryName;
		this.categoryId = categoryId;
		
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}



	

}
