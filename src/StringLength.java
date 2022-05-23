import java.util.Scanner;

public class StringLength {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String a = s.next();
        int Length =  a.length();
        System.out.println("The length is "+ Length);

    }
}
