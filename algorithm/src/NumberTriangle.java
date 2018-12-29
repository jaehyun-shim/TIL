import java.util.Scanner;

public class NumberTriangle {
    public static void main(String args[]) {
        int i, j, N = 1, L, NL = 1;

        Scanner sc = new Scanner(System.in);

        L = Integer.parseInt(sc.nextLine());

        for (i = L; i >= 1; i--) {
            for (j = 1; j <= i + 3; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= NL; j++) {
                System.out.print(N % 10 + " ");
                N = N + 1;
            }

            System.out.println();

            NL = NL + 1;
        }
    }

}
