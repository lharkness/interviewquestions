package com.leeharkness.programmingchallenges;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class BinaryDetectorTest {

    private String input;
    private boolean expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return BinaryTestParametersProvider.provide();
    }

    public BinaryDetectorTest(String input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void testSimpleDetect() {
        assertThat(BinaryDetector.simpleDetect(input), is(expected));
    }

    @Test
    public void testFineGrainedDetect() {
        assertThat(BinaryDetector.fineGrainedDetect(input), is(expected));
    }

    @Test
    public void testShortCircuitedFineGrainedDetect() {
        assertThat(BinaryDetector.shortCircuitedFineGrainedDetect(input), is(expected));
    }
}
