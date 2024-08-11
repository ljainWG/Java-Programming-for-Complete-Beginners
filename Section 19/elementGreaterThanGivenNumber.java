import java.util.Arrays;
import java.util.Scanner;

public class elementGreaterThanGivenNumber {
    
    /**
     * This method determines whether there's an element greater than a given number in an array.
     *
     * @param array The array to search through.
     * @param number The number to compare with the array elements.
     * @return True if there's an element greater than the given number in the array, false otherwise.
     */
    public boolean doesHaveElementGreaterThan(int[] array, int number) {

        if(array.length == 0)
        return false;
        
        int arrlength = array.length;
        for(int i=0;i<arrlength;i++){
            if(array[i] > number)
            return true;
        }
        
        return false;
    }
    public static void main(String[]  args){
        int[] array = new int[5];
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        number = sc.nextInt();
        System.out.println("Enter an array of 5 elements");
        for(int i=0;i<5;i++)
        array[i]=sc.nextInt();
        elementGreaterThanGivenNumber obj = new elementGreaterThanGivenNumber();
        boolean result = obj.doesHaveElementGreaterThan(array,number);
        String str = Arrays.toString(array);
        System.out.printf("Is there any number in array %s which is greater than number %d : %s",str,number,result).println();
        sc.close();
    }
}