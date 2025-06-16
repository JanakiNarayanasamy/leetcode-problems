package easyProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3}, nums2 = {1, 1, 2, 2};
        System.out.println(findDifference2(nums1, nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        int[] arr1 = new int[1001];
        int[] arr2 = new int[1001];
        int maxSize = Math.max(nums1.length, nums2.length);
        List<Integer> nums1List = new ArrayList<>();
        List<Integer> nums2List = new ArrayList<>();
        for (int i = 0; i < maxSize; i++) {
            arr1[nums1[i]]++;
            arr2[nums2[i]]++;
        }
        for (int i = 0; i < maxSize; i++) {
            if (arr2[nums1[i]] == 0) {
                nums1List.add(nums1[i]);
                arr2[nums1[i]] = -1;
            }
            if (arr1[nums2[i]] == 0) {
                nums2List.add(nums2[i]);
                arr1[nums2[i]] = -1;
            }
        }
        res.add(nums1List);
        res.add(nums2List);
        return res;
    }

    public static List<List<Integer>> findDifference1(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> nums1List = new ArrayList<>();
        List<Integer> nums2List = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {

            if (!set2.contains(nums1[i])) {
                nums1List.add(nums1[i]);
                set2.add(nums1[i]);
            }

        }
        for (int i = 0; i < nums2.length; i++) {
            if (!set1.contains(nums2[i])) {
                nums2List.add(nums2[i]);
                set1.add(nums2[i]);
            }
        }
        res.add(nums1List);
        res.add(nums2List);
        return res;
    }
    public static List<List<Integer>> findDifference2(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();

        for (int n : nums1) h1.add(n);
        for (int n : nums2) h2.add(n);

        for (int n : nums2) {
            if (h1.contains(n)) {
                h1.remove(n);
                h2.remove(n);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(h1));
        result.add(new ArrayList<>(h2));

        return result;
    }

}
