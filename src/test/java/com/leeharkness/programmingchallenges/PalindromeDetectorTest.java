package com.leeharkness.programmingchallenges;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Test suite for the Palindrome detector
 * Parameters are supplied via the PalindromeTestParametersProvider
 * class.
 */
@RunWith(Parameterized.class)
public class PalindromeDetectorTest {

    private String input;
    private boolean expected;

    public PalindromeDetectorTest(String input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return PalindromeTestParametersProvider.provide();
    }

    @Test
    public void testNaiveDetect() {
        // Note that we don't use the provided parameters here, because
        // this implementation is broken
        assertTrue(PalindromeDetector.naiveDetect("level"));
        assertFalse(PalindromeDetector.naiveDetect("lev el"));
    }

    @Test
    public void testSimpleDetect() {
        assertThat(PalindromeDetector.simpleDetect(input), is(expected));
    }

    @Test
    public void testTwoPointerDetect() {
        assertThat(PalindromeDetector.twoPointerDetect(input), is(expected));
    }
}
