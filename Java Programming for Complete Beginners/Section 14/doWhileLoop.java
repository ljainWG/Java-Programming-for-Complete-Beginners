import java.util.Scanner;
public class doWhileLoop {

    static void findFactorial() {

		Scanner sc = new Scanner(System.in);

		int x;
		long factorial;

		do {
			System.out.println("Enter a positive number");
			x = sc.nextInt();
			
			if(x<0) {
				System.out.printf("Factorial value for %d doesn\'t exists", x).println();
			} else {
				int i = 1;
				factorial = 1;
				while (i <= x) {
					factorial *= i;
					i++;
				}
				System.out.printf("Factorial value for %d is %d", x, factorial).println();
			}
		} while (x >= 0);

		sc.close();
	}

    static void print() {
		System.out.println();
	}

    public static void main(String[] args) {
		

		doWhileLoop.findFactorial();
		print();
	}
    
}