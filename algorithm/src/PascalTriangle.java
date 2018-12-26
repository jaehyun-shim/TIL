
public class PascalTriangle {
    public static void main(String args[]) {

        int i, j, p[][] = new int[20][20], n = 6;

        p[1][n] = 1;

        for (i = 2; i <= n; i++) {
            for (j = 1; j <= n * 2; j++) {
                p[i][j] = p[i - 1][j - 1] + p[i - 1][j + 1];
            }
        }
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n * 2; j++) {
                if (p[i][j] == 0)
                    System.out.print("   ");
                else
                    System.out.print(p[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
