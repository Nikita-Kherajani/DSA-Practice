import java.util.*;

public class rough {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n / 2;
        int st = 1;
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");

            }
            for (int j = 1; j <= st; j++) {
                System.out.print(k + "\t");
                int k = val;
                k++;
            }

            if (i <= n / 2) {
                sp--;
                st = st + 2;
                val++;

            } else {
                sp++;
                st = st - 2;
                val--;

            }
            System.out.println();
        }
    }
}