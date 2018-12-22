import java.util.Arrays;
import java.util.Scanner;

public class LastDayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;
        int month;

        Integer[] case1 = {5, 7, 1, 3, 8, 12, 10};
        Integer[] case2 = {4, 6, 9, 11};
        int case3 = 2;

        boolean case3_var;

        year = Integer.parseInt(sc.nextLine());
        month = Integer.parseInt(sc.nextLine());

        if (useList(case1, month)) {
            System.out.println(year + "년 " + month + "월은 31일 입니다.");
            return;
        } else if (useList(case2, month)) {
            System.out.println(year + "년 " + month + "월은 30일 입니다.");
            return;
        } else if (month == case3) {
            case3_var = year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
            if (case3_var) {
                System.out.println(year + "년 " + month + "월은 29일 입니다.");
            } else {
                System.out.println(year + "년 " + month + "월은 28일 입니다.");
            }
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }

    }

    public static boolean useList(Integer[] arr, int targetValue) {
        for (int tt : arr) {
            System.out.println(tt + " -> find..." + targetValue);
        }

        //이진탐색사용 - 사용전 정렬필요.
        //Arrays.sort(arr);
        //Arrays.binarySearch(arr, targetValue) >= 0

        //배열을 문자열로 변환하여 matches 함수로 검색.
        //Arrays.toString(array).matches(".*" + key + ".*");

        //프리미티브의 배열을 전달하는 경우 asList의 내부요소 자체가 List<int[]> 이므로 contains(num) 경우 false 가 리턴됨.
        //List<int>가 없음.
        return Arrays.asList(arr).contains(targetValue);
    }

}
