import java.util.Scanner;

public class reverseArray {

    public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n ; i++)
        arr[i] = s.nextInt();
    int max = arr.length;
    for(int i = max-1; i >= 0; i--){
        System.out.println(arr[i]+" ");
    }

    }

}