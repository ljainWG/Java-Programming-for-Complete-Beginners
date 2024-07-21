import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DetermineMultiples {
    /**
     * This method generates a list of multiples of a given number less than a specified limit.
     * 
     * @param number the number to find multiples of
     * @param limit the upper bound for the multiples
     * @return a List of multiples of the number less than the limit
     */
    public List<Integer> determineMultiples(int number, int limit) {

        // Write your code here
        List<Integer> result = new ArrayList<Integer>();

        int value = number;
        while(value<=limit){
            result.add(value);
            value+=number;
        }
        return result;
        
    }

    public String convertListIntoString(List<Integer> ls) {
        StringBuilder sb = new StringBuilder();
        int lslength = ls.size();
        for (int i = 0; i < lslength; i++) {
            sb.append(ls.get(i));
            if (i < lslength - 1) {
                sb.append(", "); 
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println("Enter the limit");
        int limit = sc.nextInt();

        DetermineMultiples obj = new DetermineMultiples();
        List<Integer> ls = obj.determineMultiples(number,limit);
        String str = obj.convertListIntoString(ls);
        System.out.printf("multiples of number %d till limit %d are %s",number,limit,str);

        sc.close();
    }
}