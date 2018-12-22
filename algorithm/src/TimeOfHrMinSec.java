import java.util.Scanner;

public class TimeOfHrMinSec {
    public static void main(String[] args){
        int H;
        int M;
        int S;
        int I;
        int R;

        Scanner sc = new Scanner(System.in);

        R = Integer.parseInt(sc.nextLine());

        H = R / 3600;
        I = R % 3600;
        M = I / 60;
        S = I % 60;

        System.out.println("["
                + R
                + "]"
                + "초의 시, 분, 초 는? : "
                + H
                + " 시간 "
                + M
                + " 분 "
                + S
                + " 초 입니다.");
    }

}