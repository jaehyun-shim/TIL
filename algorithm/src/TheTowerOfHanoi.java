import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BOJ#11729 하노이 탑 이동 순서
 * <p>
 */

public class TheTowerOfHanoi {

    //static final int EMPTY = -1;

    static int cnt;
    static int num = 1;

    public static void hanoi(int n, String first, String second, String third) {
        cnt++;
        if (n == 1) {
            System.out.println(num++ + ". [" + n + "]번 탑을 " + first + "에서 " + third + "으로 이동.");
        } else {
            hanoi(n - 1, first, third, second);

            System.out.println(num++ + ". [" + n + "]번 탑을 " + first + "에서 " + third + "으로 이동.");


            hanoi(n - 1, second, first, third);

            System.out.println("---------------------------------------");
        }
    }

    public static void main(String[] args) throws IOException {
        int n;
        int pow;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        hanoi(n, "첫번째 기둥", "두번째 기둥", "세번째 기둥");

        System.out.println("총 이동횟수 : " + cnt + "번");

        pow = (int) Math.pow(2, n) - 1;

        System.out.println("2의 " + n + " 제곱수 : " + pow);

    }
}
