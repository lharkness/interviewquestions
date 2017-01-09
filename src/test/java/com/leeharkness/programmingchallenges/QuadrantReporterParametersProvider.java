package com.leeharkness.programmingchallenges;

import java.util.Arrays;
import java.util.Collection;

public class QuadrantReporterParametersProvider {
    static Collection<Object[]> provide() {
        return Arrays.asList(new Object[][] {
                { 0,    1 },
                { 1,    1 },
                { 89,   1 },
                { 90,   2 },
                { 91,   2 },
                { 179,  2 },
                { 180,  3 },
                { 269,  3 },
                { 270,  4 },
                { 360,  4 }
        });
    }
}
