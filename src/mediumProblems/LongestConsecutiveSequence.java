package mediumProblems;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums){
            set.add(num);
        }
        int longestStreak = 0;

        for(int num:set){
            if(!set.contains(num-1)) {
                int currentNum = num;
                int maxStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    maxStreak++;
                }
                longestStreak = Math.max(longestStreak, maxStreak);
            }
        }
        return longestStreak;
    }
}
