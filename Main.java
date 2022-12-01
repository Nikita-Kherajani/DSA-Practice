import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int t = scn.nextInt();

    for (int i = 0; i < t; i++) {
      int count = 0;
      int n = scn.nextInt();

      for (int j = 1; j * j <= n; j++) {

        if (n % j == 0) {
          count++;
          break;
        }

      }

      if (count == 1) {
        System.out.println("prime");

      } else {
        System.out.println("not prime");
      }
    }

  }
}