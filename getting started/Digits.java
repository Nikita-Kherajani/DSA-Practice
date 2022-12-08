import java.util.*;

public class Digits {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int copy = n;
        int count = 0;
        int q;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        n = copy;
        int i = (int) Math.pow(10, count - 1);
        while (i != 0) {
            q = n / i;
            System.out.println(q);
            n = n % i;
            i = i / 10;
        }
    }
}
