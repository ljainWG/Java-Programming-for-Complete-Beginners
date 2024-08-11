import java.util.Arrays;
import java.util.Scanner;

public class SumsEqual {

    private int[] array1;
    private int[] array2;

    public SumsEqual(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public boolean areSumsEqual() {

        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);
        if(sum1==sum2)
        return true;
        return false;

        // Write the code to compare the sums of the arrays and return the result.
    }

    private int calculateSum(int[] array) {
        
        // Write the code to calculate the sum of the array.
        int sum=0;
        for (int val : array)
        sum+=val;
        
        return sum;

    }
    public static void main(String[]  args){
        int[] array1 = new int[7];
        int[] array2 = new int[7];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an array of 7 elements");
        for(int i=0;i<7;i++)
        array1[i]=sc.nextInt();

        System.out.println("Enter another array of 7 elements");
        for(int i=0;i<7;i++)
        array2[i]=sc.nextInt();

        SumsEqual obj = new SumsEqual(array1,array2);
        boolean result = obj.areSumsEqual();
        String str1 = Arrays.toString(array1);
        String str2 = Arrays.toString(array2);
        System.out.printf("Sum of elements of both arrays %s and %s are equal : %s",str1,str2,result).println();
        sc.close();
    }

}