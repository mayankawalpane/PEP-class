import java.util.*;

class Add {

    void even_odd(int a) {

        if (a % 2 == 0) {
            System.out.println("The Number is Even");
        } else {
            System.out.println("The Number is Odd");
        }
    }
}

public class Sum_of_Digit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int a = sc.nextInt();

        Add ad = new Add();

        ad.even_odd(a);
    }
}