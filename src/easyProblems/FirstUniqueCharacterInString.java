package easyProblems;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch:s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for (Map.Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getValue() == 1){
                return s.indexOf(entry.getKey());
            }
        }
        return -1;
    }
}
