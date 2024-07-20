import java.util.Scanner;
public class RightmostDigit {

    /**
     * This method finds the rightmost digit in a given string.
     * The method getRightmostDigit takes a string str as its argument. The string can contain any characters, including digits, letters, and special characters. 
     * Your task is to iterate through the string from right to left, checking each character to see if it's a digit. 
     * If you encounter a digit, you should immediately return it as an integer. Note that the digit is represented as a character in the string, so you will need to convert it to an integer before returning it. 
     * If you have checked all the characters in the string and haven't found a digit, you should return -1. 
     * Edge Case: If the string is empty, you should also return -1.
     * 
     * If the input string is "I bought 5 apples, 4 bananas, and 3 oranges", the method should return 3,
     * because 3 is the rightmost digit in the string.
     * 
     * If the input string is "There are no numbers in this string", the method should return -1,
     * because there are no digits in the string.
     * 
     */
    public int getRightmostDigit(String str) {

        // Write your code here
        if(str.isEmpty())
        return -1;
        
        int len = str.length();
        for(int i=len-1;i>=0;i--){
            char ch = str.charAt(i);
            if( Character.isDigit(ch) )
            return Character.getNumericValue( ch );
        }
        
        return -1;
        
    }public static void main(String[] args) {
        RightmostDigit obj = new RightmostDigit();
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        int result = obj.getRightmostDigit(str);
        if (result== -1) {
            System.out.printf("\"%s\" doesn\'t have any digit in it", str).println();
        } else{
            System.out.printf("\"%s\" have atleast one digit in it and the right most digit is %d", str, result).println();
        }
        sc.close();
    }
}