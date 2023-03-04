package handlers;

import problems.StringProbs;

public class StringProbsHandler {
    public void runStringProblems() {
        var stringProbsObj = new StringProbs();

        // Longest Substring Without Repeating Characters
        System.out.println("Longest Substring Without Repeating Characters");
        System.out.println(stringProbsObj.longestSubStringWithoutReaptingCharacter("abcabcbb"));

        // Valid Anagram
        System.out.println("Valid Anagram");
        System.out.println(stringProbsObj.isAnagram("anagram", "nagaram"));

        // Valid Parentheses
        System.out.println("Valid Parentheses");
        System.out.println(stringProbsObj.isValidParentheses("()[]{}"));

    }
}
