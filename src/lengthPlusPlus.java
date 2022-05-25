import java.util.Scanner;

public class lengthPlusPlus {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        int length = 0;
        for(char c: s1.toCharArray())
            length++;
        System.out.println(length);
    }
}
