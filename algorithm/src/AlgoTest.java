public class AlgoTest {
    /*public static void main(String[] args) {
        int n = 6, a = 0;

        String answer = "";

        while (n > 0) {
            n = n / 3; // ex: 3
            System.out.println("N : " + n);
            a = n % 3; // ex: 3
            System.out.println("A : " + a);

            if (a == 0) n -= 1;

            answer = "421".split("")[a] + answer;
            System.out.println("answer : " + "412".split("")[a]);
        }

        System.out.println("--------------------");
        System.out.println("Final : " + answer);
    }*/

    /*
    public static void main(String[] args) {
        String A = "browoanoommnaon"; // zyelleyz
        solution(A);
    }

    private static int solution(int S) {
        int R = 0;

        for (int i = 0; i < S ; i++) {

        }

        return R;
    }*/

    /*public static String[] reverse(String[] A) {
        String[] result = new String[A.length];
        for (int i = A.length - 1; i >= 0; i--) {
            result[(A.length - i) - 1] = A[i];
        }
        return result;
    }

    public static void solution(String A) {
        String[] reverseFormatString = reverse(A.split(""));

        Stack stack = new Stack();

        for (String str : reverseFormatString) {
            if (!stack.empty() && str.equals(stack.peek())) {
                stack.pop();
                continue;
            }
            stack.push(str);
        }

        while (!stack.empty()) {
            String val = (String) stack.pop();
            System.out.print(val);
        }
    }*/

}