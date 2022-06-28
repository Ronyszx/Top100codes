import java.util.Scanner;

public class SmallestInAarray {
    public static void main(String args[]){
        Scanner s =  new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n; i++){
            arr[i]=s.nextInt();
        }
        int min = arr[0];
        for (int i = 0 ; i < arr.length; i++){
            if( min > arr[i]){
                arr[i] = min;
            }
        }
        System.out.println("The smallest element in array is "+min);
    }
}
