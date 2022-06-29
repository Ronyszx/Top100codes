import java.util.Scanner;

public class LargestAndSmallestInArray {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i<n;i++){
            arr[i]= s.nextInt();
        }
        System.out.println("The lowest value in a array is:");
        int min = arr[0];
        for(int i= 0 ; i < arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
        System.out.println("the highest value in a array is:");
        int max = arr[0];
        for(int i  = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.print(max);
    }

}
