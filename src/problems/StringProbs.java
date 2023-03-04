package problems;

import java.util.*;

public class StringProbs {

    public int longestSubStringWithoutReaptingCharacter(String str) {
        int length = str.length(), result = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0, i = 0; j < length; j++) {
            if (map.containsKey(str.charAt(j))) {
                i = Math.max(map.get(str.charAt(j)), i);
            }
            result = Math.max(result, j - i + 1);
            map.put(str.charAt(j), j + 1);
        }
        return result;
    }

    public boolean isAnagram(String str1, String str2) {
        char[] sArray = str1.toCharArray();
        char[] tArray = str2.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    public boolean isValidParentheses(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();

    }
}
