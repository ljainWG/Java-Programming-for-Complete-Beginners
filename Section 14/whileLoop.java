public class whileLoop {
    
    static void printSquareLimit(int limit) {
        if (limit < 0) {
            whileLoop.print(-1);
        }
        if (limit < 0) {
            whileLoop.print(0);
        }

        int tempNum = 1;
        int i = 1;
        while (tempNum <= limit) {
            whileLoop.print(tempNum);
            i++;
            tempNum = i * i;
        }
    }

    static void printCubeLimit(int limit) {
        if (limit < 0) {
            whileLoop.print(-1);
        }
        if (limit < 0) {
            whileLoop.print(0);
        }

        int tempNum = 1;
        int i = 1;
        while (tempNum <= limit) {
            whileLoop.print(tempNum);
            i++;
            tempNum = i * i * i;
        }
    }

    static void print(int num) {
        System.out.println(num);
    }
    static void print() {
        System.out.println();
    }

    public static void main(String[] args) {
        
        whileLoop.printSquareLimit(30);
        whileLoop.print();
        whileLoop.printCubeLimit(30);
        whileLoop.print();
        
        
    }
}