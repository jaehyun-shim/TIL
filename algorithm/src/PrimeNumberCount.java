import java.util.Scanner;

public class PrimeNumberCount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int x, y, n, sw, cnt = 0;

        n = Integer.parseInt(sc.nextLine());

        long start = System.currentTimeMillis();
        for (x = 2; x <= n; x++) {
            sw = 1;
            for (y = 2; y < x; y++) {
                if (x % y == 0) { // x가 루프중 한번이라도 y와 나누어 떨어진다면 그 수는 빠져나옴.
                    sw = 0;
                    break; // 4.727 초 -> 0.366 초
                }
            }

            if (sw == 1) {
                cnt++;
                System.out.println("출력 : " + x);
            }
        }
        long end = System.currentTimeMillis();

        System.out.println("소수합계 : " + cnt + " 개");
        System.out.println("걸린시간 : " + (double)(end-start)/1000 + " 초");

    }

}
