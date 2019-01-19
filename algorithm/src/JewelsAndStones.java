public class JewelsAndStones {
    public static void main(String args[]) {
        String J = "aA", S = "aAAbbbb";
        int cnt = 0;

        String[] J_Array;
        String[] S_Array;

        J_Array = J.split("");
        S_Array = S.split("");

        for (int i = 0; i < J_Array.length; i++) {
            for (int j = 0; j < S_Array.length; j++) {
                if(J_Array[i].equals(S_Array[j])){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

}
