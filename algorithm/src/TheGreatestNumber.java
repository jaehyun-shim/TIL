public class TheGreatestNumber {
    private static int[] arrA;

    public TheGreatestNumber(int[] arrA) {
        this.arrA = arrA;
    }

    public static void quickS(int low, int high) {
        int mid = (low + high) / 2;
        int left = low;
        int right = high;
        int pivot = arrA[mid];
        while (left <= right) {
            while (arrA[left] > pivot)
                left++;
            while (arrA[right] < pivot)
                right--;
            if (left <= right) {
                int temp = arrA[left];
                arrA[left] = arrA[right];
                arrA[right] = temp;
                left++;
                right--;
            }
        }

        if (low < right)
            quickS(low, right);
        if (left < high)
            quickS(left, high);
    }

    public String solution(int[] numbers) {
        String answer = "";

        answer = answerStringBuilder(numbers);

        int[] answerChar = new int[answer.length()];

        for (int i = 0; i < answerChar.length; i++) {
            answerChar[i] = Integer.parseInt(answer.substring(i, i + 1));
        }

        answerConstructor(answerChar);

        quickS(0, arrA.length - 1);

        return answerStringBuilder(arrA);
    }

    static void answerConstructor(int[] numberc) {
        new TheGreatestNumber(numberc);
    }

    static String answerStringBuilder(int[] numberArray) {
        StringBuilder beforeValue = new StringBuilder();

        for (int i = 0; i < numberArray.length; i++) {
            String str = String.valueOf(numberArray[i]);
            if (str != null) {
                beforeValue.append(str);
            }
        }
        return String.valueOf(beforeValue);
    }

}
