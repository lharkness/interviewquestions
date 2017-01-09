package com.leeharkness.programmingchallenges;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NameLookupTest {

    @Test
    public void testLookup() {
        assertThat(NameLookup.lookup("Alice"), is("Alice Hardy"));
        assertThat(NameLookup.lookup("joe"), is("joe null"));
    }

}
