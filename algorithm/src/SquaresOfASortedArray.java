public class SquaresOfASortedArray {
    public static void main(String args[]) {
        int[] str = {-7,-3,2,3,11};
        int result[] = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            if (str[i] < 0) {
                str[i] = -(str[i]);
            }
            result[i] = str[i] * str[i];
        }

        for (int j = 0; j < str.length; j++) {
            System.out.print(result[j] + " ,");
        }

        quickSort(result, 0, result.length - 1);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int num[], int start, int end) {

        if (start >= end) return;

        int left = start;
        int right = end;
        int pivot = num[(left + end) / 2];

        do {
            while (num[left] < pivot) left++;
            while (num[right] > pivot) right--;

            if (left <= right) {
                int temp = num[left];
                num[left] = num[right];
                num[right] = temp;
                left++;
                right--;
            }
        } while (left <= right);

        if (start < right) quickSort(num, start, right);
        if (end > left) quickSort(num, left, end);
    }

}
