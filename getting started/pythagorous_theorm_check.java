import java.util.*;

public class pythagorous_theorm_check {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;

        }
        if (max == a) {
            boolean flag = ((b * b) + (c * c) == (a * a));
            System.out.print(flag);
        }
        if (max == b) {
            boolean flag = ((a * a) + (c * c) == (b * b));
            System.out.print(flag);
        }
        if (max == c) {
            boolean flag = ((b * b) + (a * a) == (c * c));
            System.out.print(flag);
        }
    }
}