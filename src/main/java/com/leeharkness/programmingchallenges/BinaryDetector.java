package com.leeharkness.programmingchallenges;

import java.util.List;
import java.util.stream.Collectors;

/**
 * holds methods which determine whether a given String can represent a Binary
 * number or not
 */
class BinaryDetector {

    static boolean simpleDetect(String input) {
        try {
            //noinspection ResultOfMethodCallIgnored
            Integer.parseInt(input, 2);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    static boolean fineGrainedDetect(String input) {
        List<Character> invalidChars = input.chars().mapToObj(i->(char)i)
                .filter(c -> c != '-')
                .filter(c -> (c < '0' || c > '1'))
                .collect(Collectors.toList());

        return invalidChars.size() == 0;
    }

    static boolean shortCircuitedFineGrainedDetect(String input) {
        for (Character c : input.toCharArray()) {
            if (c == '-') {continue;}
            if (c < '0' || c > '1') {
                return false;
            }
        }

        return true;
    }

}
