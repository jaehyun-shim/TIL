import java.util.Scanner;

public class PascalTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i, j, n, p[][] = new int[100][100];

        n = Integer.parseInt(sc.nextLine());

        p[1][n] = 1;

        for (i = 2; i <= n; i++) {
            for (j = 1; j <= n * 2; j++) {
                p[i][j] = p[i - 1][j - 1] + p[i - 1][j + 1];
            }
        }
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n * 2; j++) {
                String to = Integer.toString(p[i][j]);
                int len = to.length();

                if (p[i][j] == 0)
                    System.out.print("   ");
                else if (len == 1)
                    System.out.print(p[i][j] + "  ");
                else if (len == 2)
                    System.out.print(p[i][j] + " ");
                else if (len == 3)
                    System.out.print(p[i][j] + "");

            }
            System.out.println();
        }


        /* 동적공간할당, 빈칸for문으로대체
        int max = 0;
        int[][] r = new int[n + 1][];
        r[1] = new int[3];
        r[1][1] = 1;

        for (int i = 2; i <= n; i++) {
            r[i] = new int[i + 2];
            for (int j = 1; j < r[i].length - 1; j++) {
                r[i][j] = r[i - 1][j - 1] + r[i - 1][j];
                String str = Integer.toString(r[i][j]);
                int len = str.length();
                if (len > max)
                    max = len;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int k = n; k > i; k--)
                System.out.format("%" + max + "s", " ");
            for (int j = 1; j < r[i].length - 1; j++)
                System.out.format("%" + (max + max) + "s", r[i][j]);
            System.out.println();
        }
        */
    }

}
