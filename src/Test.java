
import java.util.*;
public class Test {
        static void fun(int i){
            System.out.println(i*(i+1)/2);
        }
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            fun(n);
        }
}
