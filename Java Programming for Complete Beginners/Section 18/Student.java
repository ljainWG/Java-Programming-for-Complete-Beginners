
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
	int[] marks = new int[5];
	int totalMarks=0;
	String name;
	String hobbies;
	ArrayList<String> conatactNo = new ArrayList<String>();

	void ContactNo() {
		int input = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("For adding a new number enter -1");
			System.out.println("For deleting a older number enter the index number of that number");
			System.out.println("To check your contact number list enter -2");
			System.out.println("To exit menu enter -3");
			System.out.println("Enter a input");
			input = sc.nextInt();

			switch (input) {
			case -3:
				break;
			case -2:
				checkContactNo();
				break;
			case -1:
				addContactNo();
				break;
			default:
				if (input < 0) {
					System.out.println("Enter a valid input");
				} else {
					deleteContactNo(input);
				}
			}

		} while (input != -3);

	}

	void checkContactNo() {
		System.out.println(this.conatactNo);
	}

	void addContactNo() {
		System.out.println("Enter your new number");
		Scanner sc = new Scanner(System.in);
		String newNum = sc.nextLine();
		this.conatactNo.add(newNum);
	}

	void deleteContactNo(int input) {
		System.out.printf("%s number deleted successfully", this.conatactNo.get(input)).println();
		this.conatactNo.remove(input);

	}

	public void studentHobbies(String... hobbie) { // studentHobbies takes an array named hobbies, the way it works as
													// it taking any-number of arguments sametime example sum(1,2)
													// sum(1,2,3) etc
													// these are called as variable arguments and they
													// must be written in last in function declaration and intailisation

		StringBuilder hobbiesBuilder = new StringBuilder();
		for (String hobby : hobbie) {
			hobbiesBuilder.append(hobby).append(" ");
		}
		this.hobbies = hobbiesBuilder.toString().trim();

	}

	public void printHobbies() {
		System.out.println("Hobbies of Student are : " + this.hobbies);
	}

	Student() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name");
		this.name = sc.nextLine();

		System.out.println("Enter your marks (of all 5 subjects outof 100)");
		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();
		}

	}
	
	public void displayMarks() {
		System.out.println("Marks of Student are " + Arrays.toString(this.marks));
		for (int mark : this.marks) {
			this.totalMarks += mark;
		}
	}
	
	public void displayResult() {

		System.out.println("Student name : " + this.name);

		this.displayMarks();

		BigDecimal avg = new BigDecimal(totalMarks).divide(new BigDecimal(marks.length), 5, RoundingMode.UP);
		System.out.println("Average marks of student is " + avg);

		if (this.totalMarks > 165) {
			System.out.println("Status = Pass");
		} else {
			System.out.println("Status = Fail");
		}
	}

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.studentHobbies("Chess");
		s1.printHobbies();
		s1.displayResult();

		Student s2 = new Student();
		s2.studentHobbies("Chess", "Cricket");
		s2.printHobbies();
		s2.displayResult();
		s2.ContactNo();

///////////////////////////////

//		Student[] obj2 = new Student[5]; // array of 5 instances of class Student
		
//		obj2[0].displayMarks();

	}

}
