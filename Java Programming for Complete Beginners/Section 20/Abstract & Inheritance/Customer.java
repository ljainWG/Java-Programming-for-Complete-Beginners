
import java.util.Scanner;

public class Customer {

	String name;
	CustomerAddress homeaddress, workaddress;

	public Customer(String name, CustomerAddress homeaddress) {
		this.name = name;
		this.homeaddress = homeaddress;
	}

	public CustomerAddress getHomeaddress() {
		return homeaddress;
	}

	public void setHomeaddress(CustomerAddress homeaddress) {
		this.homeaddress = homeaddress;
	}

	public CustomerAddress getWorkaddress() {
		return workaddress;
	}

	public void setWorkaddress(CustomerAddress workaddress) {
		this.workaddress = workaddress;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return String.format("Name : %s, Home Address : [%s], Work Address : [%s]", this.getName(),
				this.getHomeaddress(), this.getWorkaddress());
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();

		System.out.println("Enter your address");
		System.out.println("Enter your line");
		String line = sc.nextLine();
		System.out.println("Enter your city");
		String city = sc.nextLine();
		System.out.println("Enter your pincode");
		String pincode = sc.nextLine();

		CustomerAddress homeAddress = new CustomerAddress(line, city, pincode);
		Customer customer1 = new Customer(name, homeAddress);
		customer1.setWorkaddress(homeAddress);
		System.out.println(customer1);

		System.out.println();
		sc.close();
	}
}
