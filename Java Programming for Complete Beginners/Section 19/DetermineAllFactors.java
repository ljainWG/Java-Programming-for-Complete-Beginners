import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DetermineAllFactors {

    /**
     * This method returns all factors of a given number in an ArrayList.
     * 
     * @param number the number to find factors of
     * @return a List of factors of the number
     */
    public List<Integer> determineAllFactors(int number) {

        // Write your code here
        if(number<1)
        return new ArrayList<Integer>() ;
        
        List<Integer> factorlist = new ArrayList<Integer>();
        int factor=1;
        do{
            if(number%factor == 0)
            factorlist.add(factor);
            
            factor++;
        }
        while(factor<=number);
        
        return factorlist;
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
    public static void main(String[]  args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int number=sc.nextInt();

        DetermineAllFactors obj = new DetermineAllFactors();
        List<Integer> result = obj.determineAllFactors(number);
        String str = obj.convertListIntoString(result);
        System.out.printf("Factors of %d are %s",number,str).println();
        sc.close();
    }

}