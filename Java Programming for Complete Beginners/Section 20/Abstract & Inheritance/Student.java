
import java.util.Scanner;

public class Student extends Person {
	private String studentId;
	private String rollNo;
	private String collegeName;

	public Student(String name, String fName, String mName, String address, String phoneNo, String eMail,
			String studentId, String rollNo, String collegeName) {
		super(name, fName, mName, address, phoneNo, eMail);
		this.studentId = studentId;
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student("L J", "A J", "L D", "XYZ", "1234567890", "xyz@gmail.com", "ECS123", "21Ewxyz@@@",
				"ABCD");
		System.out.println();

		sc.close();
	}

}
