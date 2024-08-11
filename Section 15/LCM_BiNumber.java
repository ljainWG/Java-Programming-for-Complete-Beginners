// Find LCM of two numbers

import java.util.Scanner;

public class LCM_BiNumber {

    private int number1;
    private int number2;

    /**
     * Constructor that initializes the two numbers.
     * @param number1: The first number.
     * @param number2: The second number.
     */
    public LCM_BiNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    /**
     * Getter for the first number.
     * @return the first number.
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * Getter for the second number.
     * @return the second number.
     */
    public int getNumber2() {
        return number2;
    }

    /**
     * Calculates and returns the least common multiple (LCM) of the two numbers.
     * If either number is negative, returns -1 as the LCM for negative numbers is undefined.
     * If either number is zero, returns 0 as the LCM of 0 and any other number is 0.
     * @return LCM of the two numbers, or -1 if either number is negative, or 0 if either number is zero.
     */
    public int calculateLCM() {
        // Write your code here
        if(number1 < 0 || number2 < 0)
        return -1;
        
        if(number1 == 0 || number2 == 0)
        return 0;
        
        int max=Math.max(number1, number2);
        
        while(true){
            if( ((max%number2) == 0) && ((max%number1) == 0) )
                return max;
            max++;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        LCM_BiNumber obj = new LCM_BiNumber(num1,num2);
        
        int result = obj.calculateLCM();
        System.out.printf("LCM of %d and %d is %d", obj.getNumber1() , obj.getNumber2() , result ).println();
        sc.close();
    }
}