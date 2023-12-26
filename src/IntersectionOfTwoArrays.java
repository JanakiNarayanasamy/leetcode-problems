import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
    int[] nums ={1,2,3,2};
    int[] nums1= {1,2,2};
        int[] intersect = intersect(nums, nums1);
        Arrays.stream(intersect).forEach(System.out::print);
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> res= new ArrayList<>();
        int[] arr = new int[1001];
        for (int i =0; i< nums1.length; i++){
            arr[nums1[i]] += 1;
        }
        for (int i =0; i < nums2.length; i++){
            if(arr[nums2[i]] > 0){
                res.add(nums2[i]);
                arr[nums2[i]] -= 1;
            }
        }
        int[] res1= new int[res.size()];
        for (int i =0; i< res.size(); i++){
          res1[i] = res.get(i);
        }

        return res1;
    }
}
