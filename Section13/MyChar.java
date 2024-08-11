import java.util.Scanner;
public class MyChar {

    // Method to determine if a character is a vowel
    public boolean isVowel(char ch) {
    
        // Use a switch statement to check for each vowel, both lowercase and uppercase
        switch (ch) {
        
            // Complete the switch statement
            case 'a' :
            case 'A' :
            case 'e' :
            case 'E' :
            case 'i' :
            case 'I' :
            case 'o' :
            case 'O' :
            case 'u' :
            case 'U' : return true;
            default:
                    
        }

        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        MyChar obj = new MyChar();
        String result = (obj.isVowel(ch)?"vowel":"consonant");
        System.out.println(ch+" is a "+result);
        sc.close();
    }
}