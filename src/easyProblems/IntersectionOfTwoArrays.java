package easyProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2){
        List<Integer> list= new ArrayList<>();
        int[] check = new int[1001];
        Arrays.fill(check, -1);
        for (int i=0; i< nums1.length;i++){
            check[nums1[i]] = 1;
        }
        for (int i=0; i< nums2.length; i++){
            if(check[nums2[i]] == 1){
                check[nums2[i]] = 0;
                list.add(nums2[i]);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
