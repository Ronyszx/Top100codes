import java.util.Scanner;

public class PrimeInRange {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers in range to be scanner" );
        int a = s.nextInt();
        int b = s.nextInt();


            for(int i =a; i<=b; i++){
                if (isPrime(i)){
                    System.out.println(i);
                }
            }
        }
    private static boolean isPrime(int a){
        int count = 0;
        if(a<2){
            return false;
        }
        for(int i = 1; i <=a; i++){
            if(a%i==0)
                count+=1;
        }
        if(count> 2){
           return false;
        }else
           return true;
    }
}
