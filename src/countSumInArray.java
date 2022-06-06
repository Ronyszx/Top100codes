import java.util.Scanner;

public class countSumInArray {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number of elements in a array");
        int n = scan.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i]= scan.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
