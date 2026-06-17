import java.util.*;

class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        Arrays.sort(arr);  // sort the array

        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);                // first element → min
        result.add(arr[arr.length - 1]);   // last element → max

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int arr[] = {-5, 6, 8, 1, 2};
        ArrayList<Integer> minMax = sol.getMinMax(arr);

        System.out.println(arr[arr]);
        // minMax will be [-5, 8]
    }
}
