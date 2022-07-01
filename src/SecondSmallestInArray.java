import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestInArray {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i <n; i++)
            arr[i] = s.nextInt();

        Arrays.sort(arr);

        System.out.println(arr.length-1);
        }
}
