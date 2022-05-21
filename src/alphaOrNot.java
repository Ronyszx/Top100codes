import java.util.Scanner;

public class alphaOrNot {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        char c = obj.next().charAt(0);
        if(c>='a'&&c<='z')
        System.out.print("Yes");
        else
        System.out.println("No");
    }
}
