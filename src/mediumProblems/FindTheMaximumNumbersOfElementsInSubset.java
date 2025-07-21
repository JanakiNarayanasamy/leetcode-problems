package mediumProblems;

import java.util.Map;
import java.util.TreeMap;

public class FindTheMaximumNumbersOfElementsInSubset {
    public static void main(String[] args) {
        int[] nums = {14,14,196,196,38416,38416};
        System.out.println(maximumLength(nums));
    }
    public static int maximumLength(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int max = 1;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){

            int count = 0;
            int curr = entry.getKey();
            if(map.get(curr) >= 2){
                count += 2;
                if(map.getOrDefault(curr*curr, 0) > 0){
                    while (map.getOrDefault(curr*curr, 0) > 0){
                        if(curr*curr == curr){
                            if(map.get(curr) %2 == 0){
                                count = map.get(curr) -1;
                            }else {
                                count = map.get(curr);
                            }
                            break;
                        }
                        if(map.get(curr*curr) >= 2){
                            count += 2;
                        }else {
                            count++;
                            break;
                        }
                        map.put(curr*curr, 0);
                        curr = curr*curr;
                    }
                }else {
                    count --;
                }
                max = Math.max(max, count);
            }
            }

        return max;
    }
}
