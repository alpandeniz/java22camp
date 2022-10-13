package oop1;

// türkçesi = bireysel müşteri   bir müşteridir yani extends yazılan diğer dosyayı yansıtır gibi düşün - belirtilen dosyanın bilgilerini aktarır.
public class IndividualCustomer extends Customer {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
