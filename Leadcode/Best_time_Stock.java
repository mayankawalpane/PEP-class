import java.util.*;


public class Best_time_Stock {

    public static void main(String[] args) {
        int stock[]={7,1,5,3,6,4};

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < stock.length; i++){
            minPrice = Math.min(minPrice, stock[i]);
            maxProfit = Math.max(maxProfit, stock[i] - minPrice);
        }

        System.out.println(maxProfit);
        
    }

    
}