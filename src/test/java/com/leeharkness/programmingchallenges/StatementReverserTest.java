package com.leeharkness.programmingchallenges;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Test suite for the StatementReverser.  Gets its parameters from
 * StatementReverserParametersProvider
 */
@RunWith(Parameterized.class)
public class StatementReverserTest {

    private String input;
    private String expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return StatementReverserParametersProvider.provide();
    }

    public StatementReverserTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void testReverse() {
        assertThat(StatementReverser.reverseViaStreams(input), is(expected));
    }

    @Test
    public void testReverseViaStack() {
        assertThat(StatementReverser.reverseViaStack(input), is(expected));
    }

    @Test
    public void testReverseViaIndices() {
        assertThat(StatementReverser.reverseViaIndices(input), is(expected));
    }

}
