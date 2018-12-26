public class PrintingTheAlphabet {
    public static void main(String args[]) {
        int a = 26, c = 65, i, j; //char c = 65 : A, Alphabet count : 26
        char s;
        for (i = 0; i <= a; i++) {
            for (j = c; j < c + i; j++) {
                s = (char) j;
                System.out.print(s);
            }
            System.out.println();
        }
    }

}
