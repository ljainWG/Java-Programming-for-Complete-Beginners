
public class CustomerAddress {
	String line, city, pincode;

	public CustomerAddress(String line, String city, String pincode) {
		super();
		this.line = line;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s", line, city, pincode);
	}

}
