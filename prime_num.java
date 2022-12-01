import java.util.*;

public class prime_num {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int low = Scn.nextInt();
        int high = Scn.nextInt();

        for (int i = low; i <= high; i++) {
            int count = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}
