import java.util.Scanner;

public class removeVowString {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2= "";
        s2 = s1.replaceAll("[AEIOUaeiou]", "");
        System.out.println(s2);
    }
}
