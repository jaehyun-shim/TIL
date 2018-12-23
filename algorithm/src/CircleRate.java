import java.util.Scanner;

public class CircleRate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, v;

        Double p = 0.0;
        Double s = 1.0;

        v = Integer.parseInt(sc.nextLine()); // 500000 = 3.141588653589781

        for (n = 1; n < v; n += 2) {
            System.out.println("# " + p + " : " + s + " * " + "(1/" + n + ")");
            p += (1.0 / n) * s;
            s = -s;
        }

        System.out.println("출력 : " + p * 4);
    }

}
