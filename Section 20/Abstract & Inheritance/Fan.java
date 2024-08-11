
import java.util.Scanner;

public class Fan {

	// state
	private double radius;
	private String color, make;
	private Boolean isOn = false;
	private byte speed = 0; // 0 to 5

	Fan(Scanner sc, String make, String color, double radius) {
		this.color = color;
		this.make = make;
		this.radius = radius;
	}

	boolean isOnFun() {
		return this.isOn;
	}

	void switchOn() {
		this.isOn = true;
		this.speed = 1;
	}

	void switchOn(byte speed) {
		this.isOn = true;
		this.speed = speed;
	}

	void switchOff() {
		this.isOn = false;
		this.speed = 0;
	}

	void changeSpeed(byte speed) {
		this.speed = speed;
		if (speed == 0) {
			this.isOn=false;
		}
	}

	void printFanState() {
		String str = String.format(
				"Make of fan is %s , Color of fan is %s, Radius of fan is %d, Is fan on : %s, Speed of fan is %d",
				this.make, this.color, this.radius, this.isOn, speed);
		System.out.println(str);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("What is the make of fan");
		String make = sc.next();
		System.out.println("What is the color of fan");
		String color = sc.next();
		System.out.println("What is the radius of fan");
		double radius = sc.nextDouble();

		Fan f1 = new Fan(sc, make, color, radius);
		f1.printFanState();

		f1.switchOn();
		f1.printFanState();

		f1.switchOff();
		f1.printFanState();

		f1.switchOn((byte) 4);
		f1.printFanState();

		f1.changeSpeed((byte) 3);
		f1.printFanState();

		System.out.println();
		sc.close();
	}
}
