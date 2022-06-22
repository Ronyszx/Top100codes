import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int sum = 0;
        for(int i = 0 ; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i)))
                sum+=(s.charAt(i)-'0');
        }
        System.out.println(sum);
    }
}