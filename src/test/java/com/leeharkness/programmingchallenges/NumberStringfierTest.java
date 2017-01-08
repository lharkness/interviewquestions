package com.leeharkness.programmingchallenges;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class NumberStringfierTest {

    private int input;
    private String expected;

    public NumberStringfierTest(int input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return NumberStringifierParametersProvider.provide();
    }


    @Test
    public void testSimpleStringifier() {
       assertThat(NumberStringifier.simpleStringify(input), is(expected));
    }
}
