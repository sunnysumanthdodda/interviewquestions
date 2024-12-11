/*
Given a string s, find the length of the longest
substring
 without repeating characters.
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

import java.util.HashMap;

public class Apolis2 {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println("Longest Substring without repeating characters : " + longestSubstring(s1));
        System.out.println("Longest Substring without repeating characters : " + longestSubstring(s2));
        System.out.println("Longest Substring without repeating characters : " + longestSubstring(s3));
    }

    public static int longestSubstring(String s) {
        if(s == null || s.isEmpty()) {
            return 0;
        }

        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;

        for(int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if(map.containsKey(currentChar)) {
                left = Math.max(left, map.get(currentChar) + 1);
            }

            map.put(currentChar, right);

            maxLength = Math.max(maxLength, right-left+1);
        }

        return maxLength;
    }
}
