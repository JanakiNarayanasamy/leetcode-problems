package mediumProblems;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInArray {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }
    public static int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue= new PriorityQueue<>();
        for (int i=0; i< nums.length; i++){
            queue.offer(nums[i]);
            if(queue.size() > k){
                queue.poll();
            }
        }
        return queue.peek();
    }
}
