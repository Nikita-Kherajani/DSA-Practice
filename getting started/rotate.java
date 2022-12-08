import java.util.*;

public class rotate {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int n = Scn.nextInt();
        int k = Scn.nextInt();
        int temp = n;
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        int div = 1;
        int mult = 1;
        for (int i = 1; i <= count; i++) {
            if (i <= k) {
                div = div * 10;
            } else {
                mult = mult * 10;
            }
        }
        int q = n / div;
        int r = n % div;
        r = (r * mult) + q;
        System.out.print(r);
    }
}