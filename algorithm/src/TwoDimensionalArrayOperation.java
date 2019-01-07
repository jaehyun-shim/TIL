public class TwoDimensionalArrayOperation {
    private static int ARRAY[][] = new int[5][5];
    private static int n = 0;

    public static int fnDigit(int num) {
        return (int) (Math.log10(num) + 1);
    }

    public static void main(String[] args) {
        for (int i = 0; i < ARRAY.length; i++) {
            for (int j = 0; j < ARRAY.length; j++) {
                n = n + 1;
                ARRAY[i][j] = n;
                if (fnDigit(ARRAY[i][j]) == 1)
                    System.out.print(ARRAY[i][j] + "*  ");
                else
                    System.out.print(ARRAY[i][j] + "* ");
            }
            System.out.println();
        }
    }
}
