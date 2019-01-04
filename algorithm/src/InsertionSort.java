import java.util.Scanner;

public class InsertionSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h, i, j, tmp, C = 5;
        int[] A = new int[C];

        for (h = 0; h < C; h++) {
            A[h] = Integer.parseInt(sc.nextLine());
        }

        for (i = 1; i < C; i++) {
            tmp = A[i];
            for (j = i - 1; j >= 0 && A[j] > tmp; j--) {
                A[j + 1] = A[j]; // ASC
            }
            A[j + 1] = tmp;
        }

        System.out.print("출력값 : ");

        for (int k = 0; k < C; k++) {
            System.out.print(A[k]);
        }
    }

}
