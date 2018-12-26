import java.util.Scanner;

public class FindThePythagorasValues {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        int a, b, x, y, z;

        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());

        for (x = a; x < b - 2; x++) {
            for (y = x + 1; y < b - 1; y++) {
                for (z = y + 1; z < b; z++) {
                    if (x * x + y * y == z * z) {
                        System.out.println(x + ", " + y + ", " + z);
                    }
                }
            }
        }
    }
}
