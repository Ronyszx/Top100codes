import java.util.Scanner;

public class sumInRange {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the initial number");
        int a = s.nextInt();
        System.out.println("Enter the final number");
        int b = s.nextInt();
        int sum = 0;

        for(int i =a; i <= b; i++){
            sum += i;
        }
        System.out.println("The sum is "+ sum);
    }
}
