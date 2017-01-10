package com.leeharkness.programmingchallenges;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.stream.Collectors;

import org.junit.runners.Parameterized;

/**
 * Holds methods which reverse words in a sentence.
 * e.g. "This is a sentence" turns into
 * "sentence a is This"
 */
class StatementReverser {

    /**
     * Parses the input into a space-delimited list of words
     * Then uses a descending iterator over the resulting array
     * @param input the sentence to reverse
     * @return the reversed sentence
     */
    static String reverseViaStreams(String input) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(input.split(" "))
                .collect(Collectors.toCollection(LinkedList::new))
                .descendingIterator()
                .forEachRemaining(word -> sb.append(word).append(" "));
        return sb.toString().trim();
    }

    /**
     * Parses the sentence into a space-delimited array of words
     * Uses a Stack data structure to reverse the array
     * @param input the sentence to reverse
     * @return the reversed sentence
     */
    static String reverseViaStack(String input) {
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = Arrays.stream(input.split(" "))
                .collect(Collectors.toCollection(Stack::new));

        while(!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }

        return sb.toString().trim();

    }

    /**
     * Steps through the input string backwards substringing words
     * based on spaces.
     * @param input the sentence to reverse
     * @return the reversed sentence
     */
    static String reverseViaIndices(String input) {
        if (input.lastIndexOf(" ") < 0) {
            return input;
        }
        StringBuilder sb = new StringBuilder();
        int index = input.length() - 1;
        while (index > 0) {
            int wordPos = input.lastIndexOf(" ", index);
            if (wordPos == -1) {
                wordPos = 0;
            }
            if (index > wordPos) {
                sb.append(input.substring(wordPos, index + 1).trim()).append(" ");
            }
            else {
                break;
            }
            index = wordPos - 1;
        }

        return sb.toString().trim();
    }
}
