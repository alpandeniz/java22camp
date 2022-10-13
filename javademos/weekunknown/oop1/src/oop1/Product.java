package oop1;

//PascalCase = İsimlendirme standardı ismi. Kelimelerin ilk harfi büyük olmasıdır. Java büyük harfe duyarlı bir dildir.
//açılan classlar her zaman büyük harf ile başlar. Yani PascalCase'dir.

// !!!!!!!! SADECE İNGİLİZCE KULLAN !!!!!!!!!!! -- açık mavi olanalr bizim verdiğimiz isimler, başlarında ki kısım ise veri tipleri.
//camelCase = ilk harf küçük geri kalan kelime başlangıçları büyük harf yazım şekli
public class Product {
	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}
