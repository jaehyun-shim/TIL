import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    private static final String[] morseCodeArray = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    static HashMap map = new HashMap();

    private static void morseCodeWords() {
        for (int i = 0; i < morseCodeArray.length; i++) {
            int j = i + 97;
            map.put(j, morseCodeArray[i]);
        }
    }

    public static int uniqueMorseRepresentations(String[] words) {
        morseCodeWords();

        Set<String> set = new HashSet<>();
        int n = 0;
        for (String word : words) {
            String s = "";
            char[] arr = word.toCharArray();
            for (int j = 0; j < arr.length; j++) {
                n = (int) arr[j];
                s += (String) map.get(n);
            }
            set.add(s);
        }
        return set.size();
    }

    public static void main(String[] args) {
        new UniqueMorseCodeWords();
        //String[] words = {"gin", "zen", "gig", "msg"};
        String[] words = {"rwjje","aittjje","auyyn","lqtktn","lmjwn"};
        System.out.println(uniqueMorseRepresentations(words));
    }


}
