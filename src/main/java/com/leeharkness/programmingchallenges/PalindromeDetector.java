package com.leeharkness.programmingchallenges;

/**
 * holds methods which employ various techniques to determine whether a given
 * String is a palindrome or not.
 * A Palindrome is defined as:
 * All alphanumeric characters, regardless of case, in the String are in the
 * same order read from right to left as from left to right.
 */
public class PalindromeDetector {

    /**
     * This is an incorrect implementation of detecting Palindromes under
     * the given definition.  It doesn't handle case insensitivity or
     * non-alphanumeric characters.
     * @param input the String to check
     * @return true if input is a Palindrome, false if not
     */
    public static boolean naiveDetect(String input) {
        StringBuilder sb = new StringBuilder(input);

        return sb.reverse().toString().equals(input);
    }

    /**
     * This is a simple correct implementation of detecting Palindromes
     * by pre-processing the input to eliminate non-alphanumeric
     * characters and disregard case.  It has the advantage of readability
     * (except perhaps that "mapToObj" call) and the disadvantages of
     * allocating two new Strings and spinning through the entire input
     * multiple times (it's both time and space wasteful)
     * @param input the String to check
     * @return true if input is a Palindrome, false if not
     */
    public static boolean simpleDetect(String input) {
        StringBuilder sb = new StringBuilder();
        input.chars().mapToObj(i->(char)i)
            .filter(Character::isLetterOrDigit)
            .forEach(sb::append);
        String original = sb.toString().toLowerCase();
        String reverse = sb.reverse().toString().toLowerCase();

        return reverse.equals(original);
    }

    /**
     * This detects whether input is a Palindrome by comparing the first and
     * last, then the next and next-to-last, and so on characters of input;
     * stopping when they don't match.  It disregards non-alphanumeric data
     * and disregards case.  It has the advantage of short-circuiting its
     * comparisons and not constructing new objects.  It has a disadvantage
     * of readability
     * @param input The input data
     * @return true if input is a Palindrome, false if not
     */
    public static boolean twoPointerDetect(String input) {
        int fp = 0;
        int bp = input.length() - 1;

        while (fp < bp) {
            if (!Character.isLetterOrDigit(input.charAt(fp))) {
                fp++;
                continue;
            }
            if (!Character.isLetterOrDigit(input.charAt(bp))) {
                bp--;
                continue;
            }
            if (Character.toLowerCase(input.charAt(bp)) !=
                    Character.toLowerCase(input.charAt(fp))) {
                return false;
            }
            fp++;
            bp--;
        }

        return true;
    }
}
