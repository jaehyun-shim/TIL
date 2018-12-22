import java.util.Scanner;

public class QuadraticEquationByKindsOfValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, D;

        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());
        c = Integer.parseInt(sc.nextLine());

        D = (int) Math.pow(b, 2) - (4 * a * c);

        if (D == 0) {
            System.out.println("중근");
        } else {
            if (D > 0) {
                System.out.println("두 실근");
            } else {
                System.out.println("허근");
            }
        }
    }

}
