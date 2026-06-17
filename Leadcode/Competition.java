import java.util.*;

public class Competition {

    public static void main(String[] args) {
        

   Scanner sc=new Scanner(System.in);

   System.out.println("Enter Rank:");

    int X=sc.nextInt();

    if(X== 1){
        System.out.println("8000");
    }
    else if(X== 2){
        System.out.println("4000");
    }
    else if(X== 3){
        System.out.println("2000");
    }
    else if(X== 4){
        System.out.println("1000");
    }
    else{

        System.out.println("Nikal Lodu");
    }

}
}
