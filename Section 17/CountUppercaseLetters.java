import java.util.Scanner;
public class CountUppercaseLetters {
    
    /**
     * This method counts the number of uppercase letters in a given string.
     *
     * @param str The string to count uppercase letters in.
     * @return The number of uppercase letters in the string.
     */
    public int countUppercaseLetters(String str) {
        if(str.isEmpty())
        return 0;
        
        int count=0;
        int len=str.length();
        
        for(int i=0;i<len;i++){
            
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
            count++;
        }
        
        return count;
        
    }
    public static void main(String[] args){
        CountUppercaseLetters obj = new CountUppercaseLetters();
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        int count= obj.countUppercaseLetters(str);
        System.out.printf("Number of uppercase characters in \"%s\" is %d",str,count).println();
        sc.close();
    }
}