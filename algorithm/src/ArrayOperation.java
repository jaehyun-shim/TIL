public class ArrayOperation {

    public static int fnDigit(int num) {
        return (int) (Math.log10(num) + 1);
    }

    public static void main(String[] args) {
        int A[][] = new int[6][6];
        int N = 0;

        /*
            {1,1}=1
            {2,2}=2 {2,1}=3
            {3,3}=4 {3,2}=5 {3,1}=6
            {4,4}=7 {4,3}=8 {4,2}=9 {4,1}=10
            {5,5}=11 {5,4}=12 {5,3}=13 {5,2}=14 {5,1}=15
        */
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j > 0; j--) {
                N = N + 1;
                A[i][j] = N;
                System.out.print("{" + i + "," + j + "}=" + A[i][j] + " ");
            }
            System.out.println();
        }
    }

}
