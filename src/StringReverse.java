import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String string  = s.next();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        System.out.println("String is: "+stringBuilder);
        stringBuilder.reverse();
        System.out.println("String is:" +stringBuilder);
    }
}
