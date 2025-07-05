package mediumProblems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "Aabb";
        System.out.println(frequencySort(s));
    }
    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch:s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character, Integer>> collect = map.entrySet().stream().sorted(Comparator.comparing(Map.Entry<Character, Integer>::getValue)
                .reversed()).collect(Collectors.toList());
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : collect) {
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
       return result.toString();
    }
}
