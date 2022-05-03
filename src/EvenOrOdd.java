
import java.util.Scanner;

public class EvenOrOdd {
    static Scanner s = new Scanner(System.in);
    public static void TernaryOperator(int n){
       String status = n %2 == 0 ? " is Even":" is odd";
        System.out.println(n + status);
    }

    public static void main(String args[]){

        System.out.println("Enter the number to check if even or odd\n");

        int num = s.nextInt();

        if(num %2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }

        TernaryOperator(3);

    }
}
