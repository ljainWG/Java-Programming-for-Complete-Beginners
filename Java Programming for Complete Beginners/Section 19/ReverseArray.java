import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    /**
     * This method reverses an array.
     * 
     * @param array the array to reverse
     * @return a new array with elements in reverse order
     */
    public int[] reverseArray(int[] inputarray) {

        // Write your code here
        int [] array = Arrays.copyOf(inputarray,inputarray.length);
        int temp=0;
        int arrlen=array.length;
        for(int i=0;i<arrlen/2;i++){
            temp=array[i];
            array[i]=array[arrlen-1-i];
            array[arrlen-1-i]=temp;
        }
        return array;
    }
    public static void main(String[]  args){
        int[] array1 = new int[7];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an array of 7 elements");
        for(int i=0;i<7;i++)
        array1[i]=sc.nextInt();

        ReverseArray obj = new ReverseArray();
        int[] result = obj.reverseArray(array1);
        String str1 = Arrays.toString(array1);
        String str2 = Arrays.toString(result);
        
        System.out.printf("Reverse of array %s is %s",str1,str2).println();
        sc.close();
    }

}