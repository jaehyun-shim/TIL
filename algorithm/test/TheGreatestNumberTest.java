import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheGreatestNumberTest {

    TheGreatestNumber theGreatestNumber = new TheGreatestNumber();

    int num1[] = {6,10,2};
    int num2[] = {3,30,34,5,9};

    @Test
    public void solution() {
        assertEquals("6210",theGreatestNumber.solution2(num1));
        assertEquals("9534330",theGreatestNumber.solution2(num2));
    }
}
