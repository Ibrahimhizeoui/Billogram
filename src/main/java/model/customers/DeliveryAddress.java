package model.customers;

public class DeliveryAddress {
	
	private String name;
	private String careof;
	private String street_address;
	private String zipcode;
	private String city;
	private String country;
	public DeliveryAddress() {}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCareof() {
		return careof;
	}
	public void setCareof(String careof) {
		this.careof = careof;
	}
	
	
	
	public String getStreet_address() {
		return street_address;
	}



	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}



	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "DeliveryAddress [careof=" + careof + ", streetAddress=" + street_address + ", zipcode=" + zipcode
				+ ", city=" + city + ", country=" + country + "]";
	}
	
}
