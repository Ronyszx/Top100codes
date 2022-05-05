import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int n = s.nextInt();

        primeno(n);
    }
    private static void primeno(int n){
        int count = 0;
        if(n<2){
            System.out.println("The number is prime number");
        }
        for(int i = 1; i <=n; i++){
            if(n%i==0)
                count+=1;
        }
        if(count> 2){
            System.out.println("The number is not prime");
        }else
            System.out.println("The number is  prime");
    }
}
