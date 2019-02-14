import java.util.ArrayList;

class Solution {


    public static void main(String[] args) {
        int[] numbers = new int[]{29, 7, 34, 2};

        ArrayList numbersList = new ArrayList();
        StringBuilder numbersStr = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            numbersStr.append(numbers[i]);


        }


        //numbersList.add(1);
        System.out.println(numbersStr);

    }
}