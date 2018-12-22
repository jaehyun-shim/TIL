import java.util.Scanner;

public class RightTriangleDivision {

    static int A, B, C, T;
    static int Ap, Bp, Cp;

    /*void swap_value(int parm_data1, int parm_data2)
    {
        A = parm_data1;
        B = parm_data2;
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        A = Integer.parseInt(sc.nextLine());
        B = Integer.parseInt(sc.nextLine());
        C = Integer.parseInt(sc.nextLine());

        Ap = (int) Math.pow(A, 2);
        Bp = (int) Math.pow(B, 2);
        Cp = (int) Math.pow(C, 2);

        if (A > B) {
            if (A > C) {
                T = Ap - Bp - Cp;
            } else {
                T = Cp - Ap - Bp;
            }
        } else {
            if (B > C) {
                T = Bp - Ap - Cp;
            } else {
                T = Cp - Ap - Bp;
            }
        }

        if (T == 0) {
            System.out.println("직각삼각형이다.");
        } else {
            System.out.println("직각삼각형이 아니다. : " + T);
        }
    }

}
