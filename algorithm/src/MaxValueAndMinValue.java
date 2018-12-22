import java.util.Scanner;

public class MaxValueAndMinValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a;
        int cnt = 0;
        int sum = 0;
        int avg = 0;
        int max = 0;
        int min = 100;


        for (; ; ) {
            a = Integer.parseInt(sc.nextLine());

            if (a < 0 || a > 100) break;

            ++cnt;

            sum = sum + a;


            if (a > max) {
                max = a;
            }

            if (a < min) {
                min = a;
            }

        }

        avg = sum / cnt;

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);
        System.out.println("최대 : " + max);
        System.out.println("최소 : " + min);
        System.out.println("갯수 : " + cnt);

    }

}
