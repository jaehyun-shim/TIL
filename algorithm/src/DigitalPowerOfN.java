import java.util.Scanner;

public class DigitalPowerOfN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, s;

        n = Integer.parseInt(sc.nextLine());

        while (n > 9) {
            s = 0;

            System.out.println("10보다 큰 출력 : " + n);

            while (n != 0) {
                s = s + n % 10;
                n = n / 10;

                System.out.println("제거된 수 : " + n % 10);
                System.out.println("제거된 수의합계 : " + s);
                System.out.println("제거된 나머지수 : " + n);
            }

            n = s;
        }
        System.out.println("최종 출력 : " + n);
    }

}
