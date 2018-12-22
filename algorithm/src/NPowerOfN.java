import java.util.Scanner;

public class NPowerOfN {

    public static void main(String args[]) {

        int a, b, i, e = 1;

        Scanner sc = new Scanner(System.in);

        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());

        /* Type1 : Math.pow */
        //e = (int)Math.pow(a,b);

        /* Type2 : for loop */
        for (i = 0; i < b; i++) {
            e *= a;
            System.out.println(i + " : " + e);
        }

        System.out.print(a + "의 " + b + "승 은? : " + e + " 입니다.");
    }
}
