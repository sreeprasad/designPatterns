package BuilderPattern;

public abstract class Address {
	
	@Override
	public String toString() {
		return "Address [country=" + country + ", state=" + state + ", street="
				+ street + ", apartmentName=" + apartmentName
				+ ", apartmentNumber=" + apartmentNumber + "]";
	}
	String country;
	String state;
	String street;
	String apartmentName;
	String apartmentNumber;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getApartmentName() {
		return apartmentName;
	}
	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}
	public String getApartmentNumber() {
		return apartmentNumber;
	}
	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

	
}
