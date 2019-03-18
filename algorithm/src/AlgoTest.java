import java.util.Stack;

public class AlgoTest {
    public static void main(String[] args) {
        String A = "browoanoommnaon"; // zyelleyz
        solution(A);
    }

    public static String[] reverse(String[] A) {
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
    }

}
