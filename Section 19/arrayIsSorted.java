import java.util.Scanner;
import java.util.Arrays;
public class arrayIsSorted {

    /**
     * This method checks if the input array is sorted in ascending order.
     * 
     * @param array the array to check
     * @return true if the array is sorted, false otherwise
     */
    public boolean isSorted(int[] array) {

        // Write code here
        int[] temp = Arrays.copyOf(array, array.length);
        
        // Sort the copy
        Arrays.sort(temp);
        
        // Compare sorted array with original array
        return Arrays.equals(array, temp);
        
    }

    public static void main(String[]  args){
        int[] array1 = new int[7];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an array of 7 elements");
        for(int i=0;i<7;i++)
        array1[i]=sc.nextInt();

        arrayIsSorted obj = new arrayIsSorted();
        boolean result = obj.isSorted(array1);
        String str1 = Arrays.toString(array1);
        
        System.out.printf("Is input array %s sorted : %s",str1,result).println();
        sc.close();
    }

}