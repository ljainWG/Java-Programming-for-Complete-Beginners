import java.util.Scanner;

public class MotorBike {

	String cName, model, numberPlate, ownerName, idate; // cName is CompanyName, iDate is IssueDate of numberplate for
														// vehicle
	int ownerContact, price;
	int cSpeed; // cSpeed is current speed

	MotorBike() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  company name : ");
		this.cName = sc.next();

		System.out.print("Enter  model name : ");
		this.model = sc.next();

		System.out.print("Enter  number plate : ");
		this.numberPlate = sc.next();

		System.out.print("Enter  owner name: ");
		this.ownerName = sc.next();

		System.out.print("Enter  Issue date of number plate: ");
		this.idate = sc.next();

		System.out.print("Enter  owner\'s contact number : ");
		this.ownerContact = sc.nextInt();

		System.out.print("Enter  vehicle\'s price : ");
		this.price = sc.nextInt();

		this.cSpeed = 0;

	}

	void vehicledetails() {
		System.out.println("Comapany name " + cName);
		System.out.println("Model " + model);
		System.out.println("Owner name " + ownerName);
		System.out.println("Number plate " + numberPlate);
		System.out.println("Date of issue number plate " + idate);
		System.out.println("Owner Contact number " + ownerContact);
	}

	void adjustSpeed() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Your Current Speed is " + cSpeed);
		System.out.println("Change your speed to : ");
		this.cSpeed = sc.nextInt();
		System.out.println("Speed changed to " + cSpeed);
		
	}

	public static void main(String[] args) {
		MotorBike b1 = new MotorBike();
		b1.vehicledetails();
		b1.adjustSpeed();
		
	}

}
