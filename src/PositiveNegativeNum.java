import java.util.Scanner;

public  class PositiveNegativeNum {
    static Scanner s = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter your Number \n");
        int num = s.nextInt();
        if (num > 0){
            System.out.println("Number is positive");
        }
        else if(num == 0)
        {
            System.out.println("Number is zero");
        }else
        {
            System.out.println("Number is negative");
        }
    }

}
