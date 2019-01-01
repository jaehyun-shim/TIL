import java.util.ArrayList;
import java.util.Scanner;

public class ReadingGrades {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int[] NA = new int[2], KO = new int[2], EN = new int[2], MA = new int[2];
        int N, B;

        for(N = 0; N < 2; N++){
            NA[N] = Integer.parseInt(sc.nextLine());
            KO[N] = Integer.parseInt(sc.nextLine());
            EN[N] = Integer.parseInt(sc.nextLine());
            MA[N] = Integer.parseInt(sc.nextLine());

            list.add(N, NA[N]);
            list.add(N, KO[N]);
            list.add(N, EN[N]);
            list.add(N, MA[N]);
        }

        B = Integer.parseInt(sc.nextLine());

        for(Integer sd : list){
            System.out.println("이름 : " + sd.toString());
        }
    }

}
