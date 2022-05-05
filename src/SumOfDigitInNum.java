import java.util.Scanner;

public class SumOfDigitInNum {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        long num = 0;
        int sum = 0;
        System.out.println("Enter the number:");
        num =  s.nextLong();

        while( num != 0){
            sum += num % 10;
            num = num/10;
        }
        System.out.println("The sum of digits is "+sum);
    }
}
