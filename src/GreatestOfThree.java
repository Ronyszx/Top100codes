import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number\n");
        int a = s.nextInt();
        System.out.println("Enter the second number\n");
        int b = s.nextInt();
        System.out.println("Enter the third number\n");
        int c = s.nextInt();

        if ((a > b) && (a > c))
            System.out.println("First is the greatest");
        else if ((b > a) && (b > c)) {
            System.out.println("Second is the greatest");
        }
        else
            System.out.println("Third is the greatest");
    }
}
