
import java.util.*;

public class Check_Lcm {

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {

        System.out.println("LCM of 70 and 5 = " + lcm(70, 5));

    }

}
