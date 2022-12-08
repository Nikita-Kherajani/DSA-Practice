import java.util.*;

public class gcd_lcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int on1 = n1;
        int on2 = n2;
        while (n1 % n2 != 0) {
            int remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;
        }
        int gcd = n2;
        // for lcm -)lcm = n1*n2/gcd
        int lcm = (on1 * on2) / gcd;
        System.out.println(gcd);
        System.out.print(lcm);
    }
}