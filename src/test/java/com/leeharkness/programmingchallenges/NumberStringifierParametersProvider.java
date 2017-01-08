package com.leeharkness.programmingchallenges;

import java.util.Arrays;
import java.util.Collection;

public class NumberStringifierParametersProvider {
    static Collection<Object[]> provide() {
        return Arrays.asList(new Object[][]{
                {0, "Zero"},
                {10, "Ten"},
                {13, "Thirteen"},
                {24, "Twenty Four"},
                {54, "Fifty Four"},
                {99, "Ninety Nine"},
                {100, "One Hundred"},
                {104, "One Hundred And Four"},
                {110, "One Hundred And Ten"},
                {125, "One Hundred And Twenty Five"},
                {999, "Nine Hundred And Ninety Nine"},
        });
    }
}