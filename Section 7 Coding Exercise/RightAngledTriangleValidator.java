import java.util.Scanner;
public class RightAngledTriangleValidator {
    public boolean isRightAngled(int side1, int side2, int side3) {
        // write your code
        if(side1<=0 || side2<=0 || side3<=0)
        return false;
        
        return (side1*side1 + side2*side2 == side3*side3) || (side1*side1 + side3*side3 == side2*side2) || (side3*side3 + side2*side2 == side1*side1) ;
    }
    public static void main(String[] args){
        RightAngledTriangleValidator obj= new RightAngledTriangleValidator();
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        boolean result = obj.isRightAngled(s1,s2,s3);
        System.out.printf("Triangle wwith sides %d, %d, %d is a %s triangle",s1,s2,s3,(result?"right angled":"not a right angled"));
    sc.close();
}
}