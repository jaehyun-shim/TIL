import java.util.Scanner;

public class SelectionSort {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h, i, j, tmp, C = 5;
        int[] A = new int[C];

        for (h = 0; h < C; h++) {
            A[h] = Integer.parseInt(sc.nextLine());
        }

        for (i = 0; i < C - 1; i++) { // 0번지를 기준번지삼아 마지막번지의 전번지까지 loop
            for (j = i + 1; j < C; j++) { // 기준번지의 다음번지부터 마지막번지까지 loop
                System.out.println("" + A[i] + ", " + A[j]);
                if (A[i] > A[j]) { // 기준번지와 다음번지를 비교하여 기준번지가 크면 swap
                    tmp = A[j];
                    A[j] = A[i];
                    A[i] = tmp;
                }
            }
        }

        System.out.print("출력값 : ");

        for (int k = 0; k < C; k++) {
            System.out.print(A[k]);
        }
    }

}
