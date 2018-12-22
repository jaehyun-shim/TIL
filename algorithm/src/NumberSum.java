import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {

        System.out.println("/* 1부터 100까지 합 */");

        int sum = 0, n = 0;

        while (n < 100) {
            n = n + 1;
            sum = sum + n;
        }

        System.out.println(" 합 계 : " + sum + "\n");
        System.out.println("/* 두 수 A 부터 B 까지의 합 */");

        int sum2 = 0;
        int a;
        int b;
        int tmp;
        int N;

        Scanner sc = new Scanner(System.in);

        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());

        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        for (N = a; N <= b; N++) {
            sum2 = sum2 + N;
        }

        System.out.println(" 합 계 : " + sum2);
    }
}
