/**
 * Created by jhshim3478@gmail.com on 2019-03-05
 * Blog : http://jaehyun-shim.github.io/blog/
 * Github : http://github.com/jaehyun-shim
 */
public class FlippinganImage {
    public static int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {

            int[] newRow = new int[A[i].length]; // A에 대입 할 새로운 열에 대한 배열을 생성한다.

            int lastIndex = newRow.length - 1; // 뒤집어 넣기 위한 배열최대값을 구한다.

            for (int j = 0; j < A[i].length; j++) {
                // 뒤집어 넣기 위해 미리 생성된 배열[newRow]의 맥스주소부터 차례로 감가하며 넣는다.
                // 루프를 돌면서 A값이 1이면 0 0이면 1을 넣는다.
                newRow[lastIndex--] = A[i][j] == 1 ? 0 : 1;
            }

            A[i] = newRow;
        }
        return A;
    }

    public static void main(String[] args) {
        int A[][] = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int B[][] = flipAndInvertImage(A);

        for (int[] row : B) {
            for (int col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

