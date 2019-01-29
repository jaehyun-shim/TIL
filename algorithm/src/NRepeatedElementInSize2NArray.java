public class NRepeatedElementInSize2NArray {
    // {2, 6, 2, 1};
    // {5, 1, 5, 2, 5, 3, 5, 4};
    // {2, 1, 2, 5, 3, 2};
    private static final int[] array = {1, 2, 3, 3};

    public static int repeatedNTimes(int[] A) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return array[i];
                }
            }

        }
        return 0;
    }

    public static void main(String args[]) {
        System.out.println(repeatedNTimes(array));
    }

}
