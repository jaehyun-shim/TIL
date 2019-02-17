import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TheGreatestNumber {
    static ArrayList numbersList = new ArrayList();
    static int[] arrNum;

    public static String solution1(int[] numbers) {
        String answer = "";
        perm(numbers, 0);
        setNumbersList(numbers);
        arrayListToArrayInt();
        answer = String.valueOf(quickS(arrNum, 0, arrNum.length - 1)[0]);
        return answer;
    }

    public static void perm(int[] arr, int pivot) {
        if (pivot == arr.length) {
            setNumbersList(arr);
            return;
        }
        for (int i = pivot; i < arr.length; i++) {
            swap(arr, i, pivot);
            perm(arr, pivot + 1);
            swap(arr, i, pivot);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void setNumbersList(int[] arr) {
        String beforeValue = "";
        for (int i = 0; i < arr.length; i++) {
            beforeValue += arr[i];
        }
        numbersList.add(Integer.parseInt(beforeValue));
    }

    public static void arrayListToArrayInt() {
        arrNum = new int[numbersList.size()];
        for (int i = 0; i < numbersList.size(); i++) {
            arrNum[i] = (int) numbersList.get(i);
        }
    }

    public static int[] quickS(int arr[], int low, int high) {
        int mid = (low + high) / 2;
        int left = low;
        int right = high;
        int pivot = arr[mid];
        while (left <= right) {
            while (arr[left] > pivot)
                left++;
            while (arr[right] < pivot)
                right--;
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        if (low < right)
            quickS(arr, low, right);
        if (left < high)
            quickS(arr, left, high);

        return arr;
    }

    public static String solution2(int[] numbers) {
        String answer = "";

        List<String> list = new ArrayList<>();
        int length = numbers.length;

        for (int i = 0; i < length; i++) {
            list.add(Integer.toString(numbers[i]));
        }

        int size = list.size();

        //Collections.sort(list, (a, b) -> (b + a).compareTo(b + a));

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String num1, String num2) {
                return (num2 + num1).compareTo(num1 + num2);
            }
        });

        if (list.get(0).equals("0")) {
            return "0";
        }

        for (int i = 0; i < size; i++) {
            answer = answer + list.get(i);
        }

        return answer;
    }

}
