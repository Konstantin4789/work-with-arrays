package com.td.test;

import com.td.test.task34.Task34;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class Task34Test {
    @Test
    public void encodedStringShouldBeCorrect() {
        String input1 = "w";
        String input2 = "ww";
        String input3 = "wwd";
        String input4 = "wwdd";
        String input5 = "wwdw";
        String input6 = "qwweeertyyuuui";

        Assertions.assertEquals("w1", Task34.encode(input1));
        Assertions.assertEquals("w2", Task34.encode(input2));
        Assertions.assertEquals("w2d1", Task34.encode(input3));
        Assertions.assertEquals("w2d2", Task34.encode(input4));
        Assertions.assertEquals("w2d1w1", Task34.encode(input5));
        Assertions.assertEquals("q1w2e3r1t1y2u3i1", Task34.encode(input6));
    }

    @Test
    public void decodedStringShouldBeCorrect() {
        String input1 = "w1";
        String input2 = "w2";
        String input3 = "w2d1";
        String input4 = "w2d2";
        String input5 = "w2d1w1";
        String input6 = "q1w2e3r1t1y2u3i1";

        Assertions.assertEquals("w", Task34.decode(input1));
        Assertions.assertEquals("ww", Task34.decode(input2));
        Assertions.assertEquals("wwd", Task34.decode(input3));
        Assertions.assertEquals("wwdd", Task34.decode(input4));
        Assertions.assertEquals("wwdw", Task34.decode(input5));
        Assertions.assertEquals("qwweeertyyuuui", Task34.decode(input6));
    }
}
