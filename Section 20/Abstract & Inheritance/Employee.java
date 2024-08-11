
import java.math.BigDecimal;
import java.util.Scanner;

public class Employee extends Person {
	private String title, employerName;
	private char employeeGrade;
	private BigDecimal salary;

	@Override
	public String toString() {
		return String.format(
				"Name : %s\nFather\'sName : %s\nMother\'sName : %s\nPhone Numer : %s\nAddress : %s\nEmail : %s\nJob Title : %s\nEmployee Grade  : %s\nEmployer Name : %s\nSalary : %s",
				name, fName, mName, phoneNo, address, eMail, title, employeeGrade, employerName, salary);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}


	public Employee(String name, String fName, String mName, String address, String phoneNo, String eMail, String title,
			String employerName, char employeeGrade, BigDecimal salary) {
		super(name, fName, mName, address, phoneNo, eMail);
		this.title = title;
		this.employerName = employerName;
		this.employeeGrade = employeeGrade;
		this.salary = salary;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee("L J", "A J", "L D", "XYZ", "123-4567-890", "xyz@gmail.com", "Intern", "WG", '1',
				new BigDecimal("30000"));
		System.out.println(e1);
		sc.close();
	}
}
