public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("binarySearch(4) : " + binarySearch(array, 4, array[0], array[array.length - 1]));
        System.out.println("---------------------------------------------");
        System.out.println("binarySearch(2) : " + binarySearch(array, 4));
    }

    public static int binarySearch(int array[], int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("index value : " + mid);
            if (array[mid] > value)
                high = mid - 1;
            else if (array[mid] < value)
                low = mid + 1;
            else
                return mid; // found
        }
        return -1; // not found
    }

    public static int binarySearch(int array[], int value, int low, int high) {
        if (high <= low)
            return -1; // not found

        int mid = (low + high) / 2;

        System.out.println("index value : " + mid);

        if (array[mid] > value)
            return binarySearch(array, value, low, mid - 1);
        else if (array[mid] < value)
            return binarySearch(array, value, mid + 1, high);
        else
            return mid; // found
    }
}
