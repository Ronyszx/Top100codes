import java.util.Arrays;
import java.util.Scanner;

public class SortHalfAscenDescen {
    public static void main(String args[]){
        System.out.println("Enter size of an array");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = 0 ;
        int[] arr = new int[n];
        for(int i = 0 ;  i < n ; i ++)
            arr[i] = s.nextInt();

        for(int i =0 ; i <arr.length/2; i++) {
            for(int j = 0 ; j< arr.length/2; j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = arr.length/2-1 ; i < arr.length; i++) {
            for(int j = arr.length/2-1 ; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0 ; i < arr.length; i++)
        System.out.println(arr[i]);
    }
}
