package kunalkushwaha;

import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        System.out.println("Enter the principal amount");
        Scanner s = new Scanner(System.in);
        int P = s.nextInt();
        System.out.println("Enter the time period");
        double T = s.nextDouble();
        System.out.println("Enter the Rate of Intrest");
        double R = s.nextDouble();
        s.close();
        double SI = (P * T * R) / 100;
        System.out.println("The simple interest is "+SI);
    }
}

