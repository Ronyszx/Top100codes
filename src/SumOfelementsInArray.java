import java.util.Scanner;

public class SumOfelementsInArray {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n; i++)
            arr[i] = s.nextInt();
        int sum= 0;
        for(int i = 0 ; i  < arr.length ; i++)
           sum += arr[i];
        System.out.println(sum);
    }
}
