import java.util.Scanner;

public class PerfectNumberChecker {
    public boolean isPerfectNumber(int number) {
        if (number<1)
        return false;
        
        int sum=0;
        for (int i=1;i<=number/2;i++){
            if(number%i==0)
            sum=sum+i;
        }
        return sum==number;
    }
    public static void main(String[] args) {
		int number;
        PerfectNumberChecker obj= new PerfectNumberChecker();
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		String result;
		if (obj.isPerfectNumber(number)) {
			result = "a Perfect Number";
		} else {
			result = "not a Perfect Number";
		}
		System.out.printf("Year %d is %s .", number, result).println();

		sc.close();
	}
}