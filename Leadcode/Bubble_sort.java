
import java.util.*;

public class Bubble_sort {

    public static void main(String[] args) {
        int arr[] = { 5, 6, 8, 2, 4, 3, 9 };

        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length-1-i;j++){
                  
                if(arr[i]>arr[j]){
                    int temp= arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }

            }

        }

        System.out.println(Arrays.toString(arr));

    }

}
