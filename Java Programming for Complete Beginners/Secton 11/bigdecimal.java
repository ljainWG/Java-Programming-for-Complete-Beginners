import java.math.BigDecimal;
import java.util.Scanner;
public class bigdecimal{
    public static void main(String[]  args){

        Scanner sc = new Scanner(System.in);
        String pa,ir,yr;
        System.out.println("Enter principal amount");
        pa=sc.next();
        System.out.println("Enter interrest rate(%)");
        ir=sc.next();
        System.out.println("Enter no of year(of investment)");
        yr=sc.next();

        BigDecimal principal = new BigDecimal(pa);
        BigDecimal intersetRate = new BigDecimal(ir);
        BigDecimal year = new BigDecimal(yr);
        BigDecimal interest = (principal.multiply(intersetRate)).multiply(year);
        interest = interest.divide(new BigDecimal("100"));

        System.out.println("Principal Amount = "+principal);
        System.out.println("Interest Earned Amount = "+interest);
        System.out.println("Total Amount = "+(interest.add(principal)));
    }
}