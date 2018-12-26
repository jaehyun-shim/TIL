public class PrintingTheFactorial {
    public static void main(String args[]) {
        int a = 2, b = 10, r, i, j;

        for (i = a; i <= b; i++) {
            System.out.print(i + "!=");
            r = 1; // 줄바꿈 될때마다 초기화
            for (j = 1; j < i; j++) {
                r = r * j; // i-1 까지 곱하여 저장
                System.out.print(j + "x");
            }
            r = r * i; // 마지막 i를 곱하여 저장
            System.out.println(i + "=" + r);
        }
    }

}
