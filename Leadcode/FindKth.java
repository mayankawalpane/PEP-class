
import java.util.*;

public class FindKth {

    public static void main(String[] args) {
        

      Scanner sc=new Scanner(System.in);

      System.out.print("Enter k= ");

      int k=sc.nextInt();

        int arr[]={10, 5, 4, 3, 48, 6, 2, 33, 53, 10};


        Arrays.sort(arr);

        System.out.println(arr[k-1]);


    }
    
}
