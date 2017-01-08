package com.leeharkness.programmingchallenges;

import java.util.List;
import java.util.stream.Collectors;

/**
 * holds methods which determine whether a given String can represent a Binary
 * number or not.  A Binary Number is comosed of only 1 and 0.
 */
class BinaryDetector {

    /**
     * This method tries to convert the input String into a
     * Binary Number using the parseInt method.  This isn't the
     * most efficient method - it constructs an Exception (and
     * attendant stack trace) as part of its normal execution path
     * @param input The number to check
     * @return true if input is a binary number, false if not.
     */
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

    /**
     * Minor improvement(?) over the simple method.  It
     * compiles a list of all invalid characters found in input
     * and returns true if that list is empty and false otherwise
     * @param input The value to check
     * @return true if input is a binary number, false otherwise
     */
    static boolean fineGrainedDetect(String input) {
        List<Character> invalidChars = input.chars().mapToObj(i->(char)i)
                .filter(c -> c != '-')
                .filter(c -> (c < '0' || c > '1'))
                .collect(Collectors.toList());

        return invalidChars.size() == 0;
    }

    /**
     * Determines whether input is a binary number.  Spin through input
     * character by character and return false as soon as we hit something
     * that isn't a "1" or a "0".  This is more time efficient than the other
     * implementation.
     * @param input The value to check
     * @return true if input is a binary number, false if not.
     */
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
