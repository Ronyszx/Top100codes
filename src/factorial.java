import java.util.Scanner;

class factorial{
    static int factorial(int num){
        if(num == 0)
            return 1;

        return num * factorial(num-1);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        System.out.println("The factorial of the number is: "+factorial(num));
    }
}
