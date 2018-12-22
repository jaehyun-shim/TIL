import java.util.Scanner;

public class DivisorOfN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, k, mode;

        n = Integer.parseInt(sc.nextLine());

        for (k = 1; k <= n / 2; k++) {
            mode = n % k;

            if (mode == 0) {
                System.out.println("약수 : " + k);
            }
        }
        System.out.println("약수 : " + n);
    }

}
