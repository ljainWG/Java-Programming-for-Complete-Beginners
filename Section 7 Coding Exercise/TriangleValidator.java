public class TriangleValidator {
    public boolean isValidTriangle(int angle1, int angle2, int angle3) {
        // write your code here
        return (angle3+angle2+angle1==180)  && (angle1>0) && (angle2>0) && (angle3>0);
    }

public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter angles of a triangle");
int angle1 = sc.nextInt();
int angle2 = sc.nextInt();
int angle3 = sc.nextInt();
TriangleValidator obj= new TriangleValidator();
		boolean result=obj.isValidTriangle(angle1, angle2, angle3);
System.out.printf("Triangle with angles %d, %d, %d is a %s traingle",angle1, angle2, angle3,(result?"Valid":"Invalid"));
sc.close();
	}
}
