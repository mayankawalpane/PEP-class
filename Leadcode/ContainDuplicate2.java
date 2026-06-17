import java.util.*;

public class ContainDuplicate2 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,1,2,3};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                int prevIndex = map.get(arr[i]);

                if (i - prevIndex <= k) {
                    System.out.println("true");
                    return;
                }
            }
            map.put(arr[i], i);
        }

        System.out.println("false");
    }
}


// package Sorting;

// import java.util.*;

// public class Bubble_sort {

//     public static void main(String[] args) {

//         int arr[] = { 3, 4, 5, 6, 4, 3, 5, 4 };

//         int a = arr.length;

//         for (int i = 0; i < arr.length; i++) {

//             for (int j = 0; j < a - 1 - i; j++) {

//                 if (arr[i] > arr[j + 1]) {
                            
//                   int temp= arr[j+1];
//                   arr[j+1]=arr[j];
//                   arr[j]=temp;

//                 }
//             }

//             System.out.println(Arrays.toString(arr));
//         }
//     }
// }
