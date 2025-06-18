package easyProblems;

public class MinimumCommonValue {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3}, nums2 = {4};
        System.out.println(getCommon(nums1, nums2));
    }
    public static int getCommon(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int size1= nums1.length;
        int size2 = nums2.length;
        if(nums1[size1 -1] < nums2[0] || nums2[size2 -1] < nums1[0]){
            return -1;
        }
        while (i<size1 && j < size2){
            if(nums1[i] == nums2[j]){
                return nums1[i];
            }else if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }
        }
        return -1;
    }
}
