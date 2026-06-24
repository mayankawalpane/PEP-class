import java.util.Scanner;
import java.util.*;
public class Check_Prime {
    public static void main(String[] args) {
        

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int a= sc.nextInt();

            if(a%2==0){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }

    }
}
