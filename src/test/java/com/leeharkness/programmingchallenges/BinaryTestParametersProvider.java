package com.leeharkness.programmingchallenges;

import java.util.Arrays;
import java.util.Collection;

class BinaryTestParametersProvider {
    static Collection<Object[]> provide(){
        return Arrays.asList(new Object[][] {
                { "1",      true },
                { "0",      true },
                { "10",     true },
                { "1011",   true },
                { "-101",   true },
                { "102",    false }
        });
    }
}
