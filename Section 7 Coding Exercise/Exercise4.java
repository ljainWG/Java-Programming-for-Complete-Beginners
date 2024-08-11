public class Exercise4 {
    
    public boolean isPass(int marks) {
        
        // Update Code : If the student's marks are greater than 50, they have passed the exam.
        if(marks<51)
        return false;
        
        return true;
    }
public static void main(String[] args) {
Exercise4 s1=new Exercise4();
Exercise4 s2=new Exercise4();
		System.out.println("Student with 52 marks is "+(s1.isPass(55)?"PASS":"FAIL"));
    System.out.println("Student with 33 marks is "+(s2.isPass(33)?"PASS":"FAIL"));
	}
}
