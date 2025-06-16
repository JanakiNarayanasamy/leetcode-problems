package easyProblems;

import java.util.HashMap;
import java.util.Map;

public class CountCommonWords {
    public static void main(String[] args) {
        String[] words1 = {"leetcode","is","amazing","as","is"}, words2 = {"amazing","leetcode","is"};
        System.out.println(countWords(words1, words2));
    }
    public static int countWords(String[] words1, String[] words2) {
        int count =0;
        Map<String , Integer> map1= new HashMap<>();
        Map<String , Integer> map2= new HashMap<>();
        for (String word: words1){
            map1.merge(word, 1, Integer::sum);
        }
        for (String word: words2){
            map2.merge(word, 1, Integer::sum);
        }
        for (Map.Entry<String , Integer> entry: map1.entrySet()){
            String word = entry.getKey();
            if (entry.getValue() == 1 && map2.getOrDefault(word, 0) == 1) {
                count++;
            }
        }
        return count;
    }

}
