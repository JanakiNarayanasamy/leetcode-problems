package easyProblems;

import java.util.LinkedHashMap;
import java.util.Map;

public class KthDistinctStringInArray {
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        int k = 2;
        System.out.println(kthDistinct(arr,k));
    }
    public static String kthDistinct(String[] arr, int k) {
        Map<String, Integer> res = new LinkedHashMap<>();
        if(arr.length < k) return "";
        for (String s:arr){
            if(!res.containsKey(s)){
                res.put(s,1);
            }else if(res.containsKey(s)){
                res.put(s,res.get(s)+1);
            }
        }
        System.out.println(res);
        if(res.size() < k) return "";
        int count =1;
        for (Map.Entry<String,Integer> entry : res.entrySet()){
            if(entry.getValue() == 1 ){
                if(count == k){
                    return entry.getKey();
                }
                count++;
            }

        }
        return "";
    }

}
