package com.leeharkness.programmingchallenges;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RectanglePrintTest {
    @Test
    public void testRectanglePrint() {
        String results = RectanglePrint.generateRectangle(3, 3);
        assertThat(results, is ("***\n* *\n***\n"));
    }
}
