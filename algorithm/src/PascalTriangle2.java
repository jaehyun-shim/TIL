import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle2 {
    static ArrayList binomial(final int N) {
        BigInteger ret = BigInteger.ONE;
        ArrayList<BigInteger> list = new ArrayList();
        for (int k = 0; k <= N; k++) {
            list.add(ret);
            ret = ret.multiply(BigInteger.valueOf(N - k))
                    .divide(BigInteger.valueOf(k + 1)); // ret *= (N - k) / (k + 1);
        }
        return list;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int p = Integer.parseInt(sc.nextLine());
        for (int n = 0; n < p; n++) {
            for (Object obj : binomial(n)) {
                System.out.print(obj + " ");
            }
            System.out.println();
        }
    }

}
