import java.util.Scanner;

public class ProgressionOfDifferencesSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int v, a = 2, b = 3, n = 1, s = a;

        v = Integer.parseInt(sc.nextLine());

        while (n <= v) { // a : 계차수열(a+b) , b : 등차수열(3,5,7,9,11,..)
            System.out.println(n + "번째 항 : " + a);

            n = n + 1;
            a = a + b;
            b = b + 2;
            s = s + a;
        }

        System.out.println(n + "번째항까지의 합 : " + s);

    }

}
