import java.util.*;


public class Find_Mising_Number {
    

    public static void main(String[] args) {
        
        int nums[] = {1, 2, 3, 5};

        int min = nums[0], max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        for (int i = min; i <= max; i++) {
            int found = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = 1;
                    break;
                }
            }

            if (found == 0) {
                System.out.println(i);
            }
        }
    }
}
