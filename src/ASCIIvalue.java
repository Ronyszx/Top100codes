import java.util.Scanner;

public class ASCIIvalue {
    public static void main(String args[]){
        Scanner s =  new Scanner(System.in);
        System.out.println("Enter the char");
        char c = s.next().charAt(0);
        int i = c;
        System.out.println("The ASCII value of char is " +i);
    }
}
