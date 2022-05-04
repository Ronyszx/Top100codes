import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year to check");
        int Year = s.nextInt();

        if(Year% 400 ==0){
            System.out.println(Year+" is a leap year");
        } else if (Year%4 ==0 && Year % 100 != 0  ) {
            System.out.println(Year + " is a leap Year");
        }else
            System.out.println(Year + " is not a leap Year");
    }
}
