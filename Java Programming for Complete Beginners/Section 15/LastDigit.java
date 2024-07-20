// In this problem, you are tasked with completing the implementation of a NumberUtils class in Java that 
// retrieves the last digit of a given integer.

// The last digit of an integer n is the rightmost digit of the integer. For instance, the last digit of 2345 is 5, 
// and the last digit of 90 is 0.

// If the input number is 0, return 0 as the last digit of 0 is 0. If the input number is negative, return -1 as 
// the last digit of negative numbers will not be considered in this problem.

import java.util.Scanner;
public class LastDigit {

    public int getLastDigit(int number) {
        // Write your code here
        if(number<0)
        return -1;
        return number%10;
    }
    public static void main(String[] args){
        LastDigit obj = new LastDigit();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int result = obj.getLastDigit(num);
        System.out.printf("Last digit of %d is %d",num,result).println();
        sc.close();
    }
}