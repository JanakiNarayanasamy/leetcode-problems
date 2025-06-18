package mediumProblems;

import java.util.HashSet;
import java.util.Set;

public class MaximumSetSizeAfterRemovals {
    public static void main(String[] args) {
        int[] nums1 = {1,2,1,1}, nums2 = {1,2,3,4};
        System.out.println(maximumSetSize(nums1,nums2));
    }
    public static int maximumSetSize(int[] nums1, int[] nums2) {
        int x=0;
        int y =0;
        Set<Integer> set1= new HashSet<>();
        Set<Integer> set2= new HashSet<>();
        for (int i=0;i< nums1.length; i++){
            set1.add(nums1[i]);
        }
        for (int i=0; i< nums2.length; i++){
            if(!set1.contains(nums2[i])){
                set2.add(nums2[i]);
            }else {
                if(set1.size() > nums1.length/2){
                    set1.remove(nums2[i]);
                    set2.add(nums2[i]);
                }
            }
        }

        x= Math.min(set1.size(), nums1.length/2);
        y= Math.min(set2.size(), nums2.length/2);
        return x+y;
    }
}
