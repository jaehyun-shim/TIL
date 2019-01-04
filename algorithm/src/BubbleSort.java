import java.util.Scanner;

public class BubbleSort {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h, i, j, tmp, C = 5;
        int[] A = new int[C];

        for (h = 0; h < C; h++) {
            A[h] = Integer.parseInt(sc.nextLine());
        }

        for (i = 0; i < C; i++) {
            for (j = 0; j < C - 1; j++) {
                System.out.println("" + A[i] + ", " + A[j]);
                if (A[j] > A[j + 1]) {
                    tmp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = tmp;
                }
            }
        }

        System.out.print("출력값 : ");

        for (int k = 0; k < C; k++) {
            System.out.print(A[k]);
        }
    }

}
