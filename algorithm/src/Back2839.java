import java.util.Scanner;

public class Back2839 {
    private static int MODNUM = 0;
    private static int DIVNUM = 0;
    private static int COUNT = 0;

    public void setMODNUM(int num) {
        this.MODNUM = num % 5;
        System.out.println("나머지는 : " + MODNUM);
    }

    public void setDIVNUM(int num) {
        this.DIVNUM = num / 5;
        System.out.println("몫은 : " + DIVNUM);
    }

    public static void setCOUNT(int num) {
        COUNT = DIVNUM + num;
    }

    public Back2839(int num) {
        setMODNUM(num);
        setDIVNUM(num);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        new Back2839(sc.nextInt());
        sc.close();

        switch (MODNUM){
            case 0 : setCOUNT(0); break;
            case 1 : case 3 : setCOUNT(1); break;
            case 2 : if (DIVNUM < 2) setCOUNT(-1); else setCOUNT(2); break;
            case 4 : if (DIVNUM < 1) setCOUNT(-1); else setCOUNT(2); break;
        }

        System.out.println("출력 : " + COUNT);

        /*
        int N = sc.nextInt();
        int X = 0;
        while (true) {
            if (N % 5 == 0) {
                System.out.printf("%d", N / 5 + X);
                break;
            } else if (N <= 0) {
                System.out.print(-1);
                break;
            }
            N -= 3;
            X++;
        }
        */

    }
}

