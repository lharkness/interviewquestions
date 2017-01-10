package com.leeharkness.programmingchallenges;

import java.util.Arrays;
import java.util.Collection;

public class StatementReverserParametersProvider {
    static Collection<Object[]> provide(){
        return Arrays.asList(new Object[][] {
                { "Simple",         "Simple" },
                { "Simple Words",   "Words Simple" },
                { "This is a list", "list a is This" }
        });
    }
}
