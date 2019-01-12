public class MatrixOperation {
    public static void main(String[] args) {
        int A[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int B[][] = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        int C[][] = new int[A.length][B.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                for (int k = 0; k < C.length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
