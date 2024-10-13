package mediumProblems;

import java.util.Arrays;
import java.util.PriorityQueue;

public class NumberOfSmallestChair {
    public static void main(String[] args) {
        int[][] times = {{3,10},{1,5},{2,6}};
        int targetFriend = 0;
        System.out.println(smallestChair(times, targetFriend));
    }
    public static int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
        int[][] st = new int[n][3];
        PriorityQueue<Integer> q = new PriorityQueue<>();
        PriorityQueue<int[]> busy = new PriorityQueue<>((a,b)-> a[0]-b[0]);
        for(int i=0; i < n; i++){
            st[i] = new int[] {times[i][0], times[i][1], i};
            q.offer(i);
        }
        Arrays.sort(st,  (a,b) -> a[0]-b[0]);
        for(int[] s:st){
            int a = s[0], b =s[1], i= s[2];
            while (!busy.isEmpty() && busy.peek()[0] <= a){
                q.offer(busy.poll()[1]);
            }
            int c = q.poll();
            if(i ==  targetFriend){
                return c;
            }
            busy.offer(new int[]{b, c});
        }
        return -1;

    }
}
