package easyProblems;

import java.util.*;

public class FindResultantArrayAfterRemovingAnagrams {
    public static void main(String[] args) {
        String[] words = {"abba","baba","bbaa","cd","cd"};
        System.out.println(removeAnagrams(words));
    }
    public static List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        String prevSorted = "";

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (!sorted.equals(prevSorted)) {
                result.add(word);
                prevSorted = sorted;
            }
        }

        return result;
    }
}
