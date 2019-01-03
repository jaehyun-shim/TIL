import java.util.Scanner;

public class ReadingGrades {
    static final int C = 3; // 입력갯수
    static int[] KO = new int[C], EN = new int[C], MA = new int[C];
    static String[] NA = new String[C];
    static Scanner sc = new Scanner(System.in);

    private static void title(int i) {
        String str = "";
        switch (i) {
            case 0:
                str = "이름 : ";
                break;
            case 1:
                str = "국어 : ";
                break;
            case 2:
                str = "영어 : ";
                break;
            case 3:
                str = "수학 : ";
                break;
            default:
                str = "";
                break;
        }
        System.out.print(str);
    }

    private static void input(int i) {
        try {
            System.out.println(i + " 번 입력");
            title(0);
            NA[i] = sc.nextLine();
            title(1);
            KO[i] = Integer.parseInt(sc.nextLine());
            title(2);
            EN[i] = Integer.parseInt(sc.nextLine());
            title(3);
            MA[i] = Integer.parseInt(sc.nextLine());
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력입니다.");
        }
    }

    public static void print(int B) {
        float total = KO[B] + EN[B] + MA[B];
        float f = total / 3;
        String avg = String.format("%.2f", f);

        System.out.println("=================");
        System.out.println("이름 : " + NA[B]);
        System.out.println("-----------------");
        System.out.println("국어 : " + KO[B]);
        System.out.println("영어 : " + EN[B]);
        System.out.println("수학 : " + MA[B]);
        System.out.println("-----------------");
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avg + " (소수둘째자리까지)");
        System.out.println("=================\n\n");
    }

    public static void main(String args[]) {
        int B, i;

        for (i = 0; i < C; i++) {
            input(i);
        }

        for (; ; ) {
            System.out.print("조회번호 : ");
            B = Integer.parseInt(sc.nextLine());

            if (B == 9) {
                System.out.print("Bye~ Bye~");
                break;
            }

            if (B >= C || B < 0) {
                System.out.println("유효한 번호가 아닙니다. 다시입력바랍니다.");
                continue;
            }

            print(B);
        }
    }

}
