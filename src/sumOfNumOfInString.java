import java.util.Scanner;

public class sumOfNumOfInString {
        public static void main(String[] args) {
             Scanner scan = new Scanner(System.in);
             String s = scan.next();
            int sum=0;
            for (int i = 0; i < s.length(); i++) {
                if(Character.isDigit(s.charAt(i)))
                    sum=sum+Character.getNumericValue(s.charAt(i));
            }
            System.out.println("Sum of all the digit present in String : "+sum);
        }

}
