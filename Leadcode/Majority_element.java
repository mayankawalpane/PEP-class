import java.util.*;

public class Majority_element {
    public static void main(String[] args) {
        int nums[]={1,2,2,3,4,2,5};
                int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        System.out.println(candidate);
    }
}
