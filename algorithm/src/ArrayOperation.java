public class ArrayOperation {
    public static void main(String[] args) {
        int A[][] = new int[5][5];
        int N = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = i; j > 0; j--) {
                N = N + 1;
                A[i][j] = N;
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

}
