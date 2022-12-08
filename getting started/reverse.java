
import java.util.*;

public class reverse {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r;
        while (n != 0) {
            r = n % 10;
            System.out.println(r);
            n = n / 10;
        }
    }
}
