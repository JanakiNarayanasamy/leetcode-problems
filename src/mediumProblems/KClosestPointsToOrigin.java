package mediumProblems;

import java.util.*;

public class KClosestPointsToOrigin {
    public static void main(String[] args) {
        int[][] points = {{3,3},{5,-1},{-2,4}};
        int k = 2;
        System.out.println(Arrays.toString(kClosest(points, k)));
    }
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(
                (a, b) -> Double.compare(
                        Math.sqrt(b[0] * b[0] + b[1] * b[1]),
                        Math.sqrt(a[0] * a[0] + a[1] * a[1])
                )
        );

        for (int[] point : points) {
            queue.offer(point);
            if (queue.size() > k) {
                queue.poll();  // Remove farthest
            }
        }

        // Collect result
        int[][] ans = new int[k][2];
        int i = 0;
        while (!queue.isEmpty()) {
            ans[i++] = queue.poll();
        }

        return ans;
    }
}
