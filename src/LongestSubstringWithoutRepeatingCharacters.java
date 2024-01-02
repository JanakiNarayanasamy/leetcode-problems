import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring1(s));

    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while(!set.add(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static int lengthOfLongestSubstring1(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128];
        for (int i = 0, j = 0; j < n; j++) {
            i = Math.max(charIndex[s.charAt(j)], i);
            maxLength = Math.max(maxLength, j - i + 1);
            charIndex[s.charAt(j)] = j + 1;
        }
        return maxLength;
    }
}
