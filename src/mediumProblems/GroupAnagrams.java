package mediumProblems;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> group = new HashMap<>();
        for (int i =0; i< strs.length; i++){
            char[] chs= strs[i].toCharArray();
            Arrays.sort(chs);
            String str = String.valueOf(chs);
            group.computeIfAbsent(str, k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(group.values());
    }
}
