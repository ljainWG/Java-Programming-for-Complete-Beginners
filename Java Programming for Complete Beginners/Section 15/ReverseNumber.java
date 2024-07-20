import java.util.Scanner;

public class ReverseNumber {

    /**
     * This method reverses a given integer and returns the reversed number.
     * If the number is negative, it returns -1 as the reverse of a negative number is undefined.
     * If the number is zero, it returns 0 as the reverse of 0 is 0.
     * @param number: an integer
     * @return reversed number, or -1 if number is negative, or 0 if number is zero.
     */
    public int reverseNumber(int number) {
        // Write your code here
        if(number<0)
        return -1;
        int result=0;
        while(number>0){
            result=result*10+number%10;
            number/=10;
        }
        return result;
        
    }
    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int result = obj.reverseNumber(num);
        System.out.printf("Reverse of number %d is %d",num,result).println();
        sc.close();
    }
}