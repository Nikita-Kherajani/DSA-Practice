import java.util.*;

public class pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if (i == j) {
        // System.out.print("*\t");
        // } else {
        // System.out.print("\t");
        // }
        // }
        //
        // neeche vala mera method hai
        int st = 1;
        int sp = 0;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            sp++;
            System.out.println();
        }
    }
}