import java.util.Scanner;

public class toggleChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String ss = s.next();
        String s1 = "";
        for (int i = 0; i < ss.length(); i++) {
            if(Character.isUpperCase(ss.charAt(i)))
                s1=s1+Character.toLowerCase(ss.charAt(i));
            else
                s1=s1+Character.toUpperCase(ss.charAt(i));
        }
        System.out.println("Toggle String is : "+s1);

    }
}
