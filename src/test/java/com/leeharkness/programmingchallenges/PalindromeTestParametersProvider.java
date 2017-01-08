package com.leeharkness.programmingchallenges;

import java.util.Arrays;
import java.util.Collection;

class PalindromeTestParametersProvider {
    static Collection<Object[]> provide(){
        return Arrays.asList(new Object[][] {
                { "level",      true },
                { "leve l",     true },
                { "Level",      true },
                { "Le v el",    true },
                { "Lev e l!",   true },
                { " Lev e l !", true },

                { "A man, a plan, a canal; Panama!", true },

                { "not",        false }
        });

    }
}
