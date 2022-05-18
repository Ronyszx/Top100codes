import java.util.Scanner;

public class StringNum {

    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if(detectString(num))
            System.out.println(num+" is a strong num");
        else
            System.out.println(num+ " is not a stromg number");
    }


    static int facto(int n){
        int fact = 1;
        for(int i = 1; i<= n; i++){
            fact = fact * 1;
        }
        return fact;
    }

        static boolean detectString(int num){
            int digit, sum = 0;
            int temp = num;
            boolean flag = false;

            while (temp!=0){
                digit = temp % 10;
                sum = sum + facto(digit);
                temp /= 10;
            }
            if (sum == num)
                flag=true;
            else
                flag = false;

            return flag;
        }
}