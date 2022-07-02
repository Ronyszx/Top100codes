import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class removeDuplicateFromArray {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i <arr.length; i++){
            arr[i] = s.nextInt();
        }
        Set hs = new HashSet();
        for (int i=0; i<n; i++)
            hs.add(arr[i]);

        System.out.print(hs);
    }
}
