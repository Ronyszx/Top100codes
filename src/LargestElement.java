import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store in a array:");
        int n = s.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements");
        for(int i = 0; i < n; i++){
            array[i]=s.nextInt();
        }
        for (int i = 0; i<n; i++)
        System.out.println(array[i]);
        int max= array[0];
        for(int i=0; i < array.length; i++)
        {
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("The biggest element is :"+ max);
    }
}
