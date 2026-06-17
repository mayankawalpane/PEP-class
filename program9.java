// import java.util.*;

// public class program9{


//     void rec(int a){
       


//     }
    
//     public static void main(String[] args) {
        
//         int arr[]={11,22,55,55,21,66};

//            for(int i=0;i<arr.length;i++){
                
//                System.out.println(arr[i]);

//            }



//     }


// }

import java.util.*; 

public class program9 { 
    void rec(int[] arr, int i) { 
        if (i == arr.length) {
            return;
        }
        System.out.println(arr[i]); 
        rec(arr, i + 1); 
    } 

    public static void main(String[] args) { 
        int arr[] = {11, 22, 55, 55, 21, 66}; 
        
        program9 obj = new program9();
        
        obj.rec(arr, 0); 
    } 
}
