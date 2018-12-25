import java.util.Scanner;

public class PerfectNumber {

    /*
        # 입력조건
            - 두 수 a, b
            - a < b
            - a, b는 10000 이하
            - 입력예시 : 1 100 (두 수 사이에 공백)
        # 출력조건
            - 범위 내의 완전수
            - 범위 내에 완전수가 없으면 "No Answer!" 를 출력
            - 출력예시 : 6 28 (출력 된 수 사이에 공백)
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str, v = "";

        int a, b, i, j, s, tmp;

        str = sc.nextLine();

        a = Integer.parseInt(str.split(" ")[0]);
        b = Integer.parseInt(str.split(" ")[1]);

        if (a > 10000 || b > 10000) {
            System.out.print("No Answer!");
            return;
        }

        if (a > b) {
            tmp = b;
            b = a;
            a = tmp;
        }

        for (i = a; i <= b; i++) {
            s = 0;
            for (j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    s = s + j; // 완전수
                }
            }

            if (i == s) {
                v += s + " ";
            }
        }

        if (v.equals("")) {
            System.out.print("No Answer!");
        } else {
            System.out.print(v);
        }
    }

}

