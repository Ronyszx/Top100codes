import java.util.*;

public class sortArray {
    public static void main(String args[]){
        int temp =0;
        int array[]= {5,3,4,2,6,3,1,4,'A',5};
        for(int i = 0; i< array.length ; i++){
            for(int j = 0 ; j< array.length; j++){
                if(array[i]<array[j]){
                    temp = array[i];
                    array[i]= array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Elements in sorted order are:");
        for(int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }
       static void myMethod(){
            int arr[] = {5, 4, 5, 3,1 , 5,4};
            //to be completed
        }

    }
}
