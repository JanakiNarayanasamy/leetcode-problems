package mediumProblems;

import java.util.*;
import java.util.stream.Collectors;

public class MediumNumberOfPushesToTypeWordII {
    public static void main(String[] args) {
        String word= "aremgjnptohswfdkyuzvicqxb";
        System.out.println(minimumPushes(word));
    }
    public static int minimumPushes(String word) {
        if(word.length() < 1 ) return 0;
        int count=0;
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = word.toCharArray();
        for(Character ch:chars){
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }else {
                map.put(ch, map.get(ch)+1);
            }
        }
        System.out.println(map);
        List<Map.Entry<Character,Integer>> list= new ArrayList<>(map.entrySet());
        List<Map.Entry<Character,Integer>> sortedList= list.stream().sorted(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                if(o1.getValue() < o2.getValue()){
                    return 1;
                }else {
                    return -1;
                }
            }
        }).collect(Collectors.toList());
        int i=0;
        for(Map.Entry<Character,Integer> entry:sortedList){
            if(i <= 7){
                count += entry.getValue()*1;
            }else if(i > 7 && i <= 15){
                count += entry.getValue()*2;
            }else if(i > 15 && i <= 23){
                count += entry.getValue()*3;
            }else {
                count += entry.getValue()*4;
            }
            i++;
        }
        return count;
    }
}
