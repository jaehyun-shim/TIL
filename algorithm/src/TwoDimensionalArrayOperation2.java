public class TwoDimensionalArrayOperation2 {
    private static int ARRAY[][] = new int[5][5];
    private static int n = 0;

    public static int fnDigit(int num) {
        return (int) (Math.log10(num) + 1);
    }

    public static void main(String[] args) {
        /*
        1* 2  3  4  5
        6  7* 8  9  10
        11 12 13*14 15
        16 17 18 19*20
        21 22 23 24 25*
        */
        /*for (int i = 0; i < ARRAY.length; i++) {
            for (int j = 0; j < ARRAY.length; j++) {
                n = n + 1;
                ARRAY[i][j] = n;

                if (j == i)
                    if (fnDigit(ARRAY[i][j]) == 1)
                        System.out.print(ARRAY[i][j] + "* ");
                    else
                        System.out.print(ARRAY[i][j] + "*");
                else
                    if (fnDigit(ARRAY[i][j]) == 1)
                        System.out.print(ARRAY[i][j] + "  ");
                    else
                        System.out.print(ARRAY[i][j] + " ");
            }
            System.out.println();
        }*/

        /*
        1  2  3  4  5
        0  6  7  8  9
        0  0  10 11 12
        0  0  0  13 14
        0  0  0  0  15
        */
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                n = n + 1;
                ARRAY[i][j] = n;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (fnDigit(ARRAY[i][j]) == 1 || ARRAY[i][j] == 0)
                    System.out.print(ARRAY[i][j] + "  ");
                else
                    System.out.print(ARRAY[i][j] + " ");
            }
            System.out.println();
        }
    }

}
