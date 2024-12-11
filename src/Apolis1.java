/* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

 */

public class Apolis1 {
    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};

        System.out.println("Output : " + longestCommonPrefix(strs1));
        System.out.println("Output : " + longestCommonPrefix(strs2));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return " ";
        }

        String commonPrefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String currentString = strs[i];
            int index = 0;

            while (index < commonPrefix.length() && index < currentString.length()
                    && commonPrefix.charAt(index) == currentString.charAt(index)) {
                index++;
            }

            commonPrefix = commonPrefix.substring(0, index);

            if(commonPrefix.isEmpty()) {
                return " ";
            }
        }
        return commonPrefix;
    }
}
