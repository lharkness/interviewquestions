package com.leeharkness.programmingchallenges;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class QuadrantReporterTest {

    private int angle;
    private int expected;

    public QuadrantReporterTest(int angle, int expected) {
        this.angle = angle;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return QuadrantReporterParametersProvider.provide();
    }

    @Test
    public void testQuadrantDetect() {
        assertThat(QuadrantReporter.quadrant(angle), is(expected));
    }

}
