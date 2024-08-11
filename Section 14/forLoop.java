public class forLoop {

    // For Loop
    static int isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return -1;
            }
        }
        return 1;
    }

    static int sumUptoNNumbers(int num) {
        if (num < 0) {
            return -1;
        }

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    static int sumOfDivisors(int num) {
        if (num < 0) {
            return -1;
        }

        int sum = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    static void printATriangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }

    static void print() {
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println(forLoop.isPrime(6));     // -1 is false and 0 is true
        forLoop.print();
        System.out.println(forLoop.sumOfDivisors(6));
        forLoop.print();
        System.out.println(forLoop.sumUptoNNumbers(6));
        forLoop.print();
        forLoop.printATriangle(6);
        forLoop.print();
        
    }
}