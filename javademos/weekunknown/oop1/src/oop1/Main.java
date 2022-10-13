package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		            //set value - değer atamak
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("------1.jpg");
	
	
		//System.out.println(product1.name);
		
		Product product2 = new Product();
		product2.setName("Delonghi Kahve Makinesi");
		product2.setDiscount(5);
		product2.setUnitPrice(3500);
		product2.setUnitsInStock(8);
		product2.setImageUrl("------2.jpg");
		
		Product product3 = new Product();
		product3.setName("Delonghi Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(500);
		product3.setUnitsInStock(10);
		product3.setImageUrl("------3.jpg");
	
	
		Product[] products = {
					product1, product2, product3
			};
		
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("05565649858");
		individualCustomer.setCustomerNumber("12");
		individualCustomer.setFirstName("Alpan");
		individualCustomer.setLastName("Deniz");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhoneNumber("05644654654");
		corporateCustomer.setTextNumber("5456456");
		corporateCustomer.setCustomerNumber("10");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		
		
		
	}

}
