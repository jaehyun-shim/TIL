import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jhshim3478@gmail.com on 2019-03-03
 * Blog : http://jaehyun-shim.github.io/blog/
 * Github : http://github.com/jaehyun-shim
 */
public class SortArrayByParity {

    public static int[] sortArrayByParity(int[] A) {
        ArrayList<Integer> list = new ArrayList<>();

        int[] B = new int[A.length];
        int S = A.length;

        for (int i = 0; i < S; i++) {
            if (A[i] % 2 == 0)
                list.add(A[i]);
        }

        for (int i = 0; i < S; i++) {
            if (A[i] % 2 != 0)
                list.add(A[i]);
        }

        for (int i = 0; i < S; i++) {
            B[i] = list.get(i);
        }

        return B;
    }

    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] A = stringToIntegerArray(line);

            int[] ret = new SortArrayByParity().sortArrayByParity(A);

            String out = integerArrayToString(ret);

            System.out.print(out);
        }
    }


}
