package mediumProblems;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,8,8,8,8,8};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer, Integer>> entries = map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry<Integer, Integer>::getValue).reversed()
                        .thenComparing(Map.Entry::getKey))
                .toList();
        return entries.stream()
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
