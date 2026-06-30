
import java.util.*;

public class Non_Repeat {
    
  public static void main(String[] args) {
    
      int arr[]={2,2,1};

      int ans=0;
      for(int num:arr){

        ans^=num;
      }

      System.out.println(ans);
      
  }

}

