
import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = s.nextInt();
        int rev = 0, rem;
        while (num != 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        System.out.println("Reversed Num\n" + rev);
    }
}
