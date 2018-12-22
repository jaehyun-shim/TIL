public class CountingANumberSatisfyingACondition {
    public static void main(String arg[]) {
        int hun, ten, cnt = 0;

        for (int n = 1001; n < 10000; n++) { // O(n)

            hun = (n / 100) % 10;
            ten = (n / 10) % 10;

            if (hun == ten) {
                if (n % 9 == 0) {
                    cnt++;
                    System.out.println(cnt + ". " + n + " : " + n / 9);
                }
            }
        }

        System.out.println("개수 : " + cnt);
    }

}
