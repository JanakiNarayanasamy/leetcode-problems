import java.util.ArrayList;
import java.util.List;

public class ConvertArrayInto2DArray {
    public static void main(String[] args) {
        int[] nums = {3,1,2,1,3};
        System.out.println(findMatrix(nums));
    }
    public static List<List<Integer>> findMatrix(int[] nums) {
        int freq[] = new int[nums.length + 1];
        ArrayList<List<Integer>> ans = new ArrayList<>();
        for (int c : nums) {
            if (freq[c] >= ans.size()) {
                ans.add(new ArrayList<>());
            }
            // Store the integer in the list corresponding to its current frequency.
            ans.get(freq[c]).add(c);
            freq[c]++;
        }

        return ans;
    }
}
