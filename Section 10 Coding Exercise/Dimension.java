import java.util.Scanner;

public class Dimension {
    private int feet;
    private int inches;
    
    public Dimension(int inches) {
        // Convert the total inches into feet and inches. One foot is 12 inches.
        // Store the feet and inches in their respective instance variables.
        if (inches<0){
            this.inches=-1;
            this.feet=-1;
        }
        
        else{this.feet=inches/12;
        this.inches=inches%12;}
    }
    
    public int getFeet() {
        // Return the value of feet.
        return this.feet;
    }
    
    public int getInches() {
        // Return the value of inches.
        return this.inches;
    }    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter inches value");
        int inch=sc.nextInt();
        Dimension obj=new Dimension(inch);
        System.out.println("Feets  = "+obj.getFeet());
        System.out.println("Inches = "+obj.getInches());
        sc.close();
    }
}