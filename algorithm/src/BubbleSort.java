import java.util.Scanner;

public class BubbleSort {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h, i, j, tmp, C = 5;
        int[] A = new int[C];

        for (h = 0; h < C; h++) {
            A[h] = Integer.parseInt(sc.nextLine());
        }

        for (i = 0; i < C - 1; i++) {
            for (j = i + 1; j < C; j++) {
                System.out.println("" + A[i] + ", " + A[j]);
                if (A[i] > A[j]) { // ASC
                    tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            }
        }

        System.out.print("출력값 : ");

        for (int k = 0; k < C; k++) {
            System.out.print(A[k]);
        }
    }

}
