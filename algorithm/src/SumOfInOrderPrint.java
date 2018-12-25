import java.util.Scanner;

public class SumOfInOrderPrint {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, x, y, s;

        n = Integer.parseInt(sc.nextLine());

        for (x = 1; x <= n; x++) {
            s = 1;
            System.out.print("(1");
            for (y = 2; y <= x; y++) {
                s = s + y;
                System.out.print("+"+y);
            }
            System.out.println(")=" + s);
        }
    }

}
