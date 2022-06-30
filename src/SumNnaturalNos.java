import java.util.Scanner;
public class SumNnaturalNos {
    public static void main(String args[]){

        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();

        for(int i = 1; i <=n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
/*   ////////////////////////////Using recursion///////////////////////////////
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
