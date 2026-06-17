
import java.util.*;

public class GasStation {
    public static void main(String[] args) {

        int[] gas = {5, 1, 2, 3, 4};
        int[] cost = {4, 4, 1, 5, 1};

        int totalGas = 0;
        int totalCost = 0;
        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];

            tank += gas[i] - cost[i];

            
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        if (totalGas >= totalCost) {
            System.out.println(start);
        } else {
            System.out.println(-1);
        }
    }
}
