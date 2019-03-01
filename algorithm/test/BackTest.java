import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

public class BackTest {

    String string = "12\n" +
            "Junkyu 50 60 100\n" +
            "Sangkeun 80 60 50\n" +
            "Sunyoung 80 70 100\n" +
            "Soong 50 60 90\n" +
            "Haebin 50 60 100\n" +
            "Kangsoo 60 80 100\n" +
            "Donghyuk 80 60 100\n" +
            "Sei 70 70 70\n" +
            "Wonseob 70 70 90\n" +
            "Sanghyun 70 70 80\n" +
            "nsj 80 80 80\n" +
            "Taewhan 50 60 90";

    Back10825 back10825 = new Back10825();

    @Test
    @DisplayName("백준-국영수")
    @Deprecated
    public void back10825() {
        assertEquals("Donghyuk\n" +
                "Sangkeun\n" +
                "Sunyoung\n" +
                "nsj\n" +
                "Wonseob\n" +
                "Sanghyun\n" +
                "Sei\n" +
                "Kangsoo\n" +
                "Haebin\n" +
                "Junkyu\n" +
                "Soong\n" +
                "Taewhan", back10825.solution(string));
    }

    @Test
    @DisplayName("백준-국영수")
    public void back10825_ListSameTest(){
        assertThat(back10825.solution_list(string), hasItems("Soong"));
    }
}
