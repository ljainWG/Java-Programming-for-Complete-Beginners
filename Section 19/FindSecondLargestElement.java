import java.util.Arrays;
import java.util.Scanner;

public class FindSecondLargestElement {
    
    /**
     * This method finds and returns the second largest element in the given array.
     * 
     * @param array the array in which to find the second largest element
     * @return the second largest element in the array
     */
     
    public int findSecondLargestElement(int[] array) {
        
        int arrlen= array.length;
        
        if(arrlen<2)
        return -1;
        
        int count=1;
        for(int i=0;i<arrlen-1;i++){
            if(array[i]==array[i+1])
            count++;
        }
        if (count== arrlen)
        return -1;
        
        int minval= Integer.MIN_VALUE;
        int minval2=minval;
        
        for(int i=0;i<arrlen;i++){
            if(minval<array[i])
            minval=array[i];
        }
        
        for(int i=0;i<arrlen;i++){
            if(minval2<array[i] && array[i] != minval)
            minval2=array[i];
        }
        
        return minval2;    

    }

    public static void main(String[]  args){
        int[] array = new int[7];
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an array of 7 elements");
        for(int i=0;i<7;i++)
        array[i]=sc.nextInt();

        FindSecondLargestElement obj = new FindSecondLargestElement();
        int result = obj.findSecondLargestElement(array);
        String str = Arrays.toString(array);
        System.out.printf("Second largest elements of array %s is %d",str,result).println();
        sc.close();
    }

}