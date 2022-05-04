import java.util.Scanner;

public class GreaterNumber {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = s.nextInt();
        System.out.println("Enter the second number");
        int b = s.nextInt();

        if(a>b)
            System.out.println("A is greater than b");
        else if (b>a) {
            System.out.println("B is greater than a");
        }else {
            System.out.println("Both are equal");
        }

        }
    }
