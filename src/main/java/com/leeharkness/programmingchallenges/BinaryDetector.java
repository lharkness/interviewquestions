package com.leeharkness.programmingchallenges;

import java.util.List;
import java.util.stream.Collectors;

public class BinaryDetector {

    public static boolean simpleDetect(String input) {
        try {
            //noinspection ResultOfMethodCallIgnored
            Integer.parseInt(input, 2);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    public static boolean fineGrainedDetect(String input) {
        List<Character> invalidChars = input.chars().mapToObj(i->(char)i)
                .filter(c -> c != '-')
                .filter(c -> (c < '0' || c > '1'))
                .collect(Collectors.toList());

        return invalidChars.size() == 0;
    }

    public static boolean shortCircuitedFineGrainedDetect(String input) {
        for (Character c : input.toCharArray()) {
            if (c == '-') {continue;}
            if (c < '0' || c > '1') {
                return false;
            }
        }

        return true;
    }

}
