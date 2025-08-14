package mediumProblems;

import java.util.HashMap;
import java.util.Map;

public class NodeWithHighestEdgeScore {
    public static void main(String[] args) {
        int[] edges = {1,3,1,2};
        System.out.println(edgeScore(edges));
    }
    public static int edgeScore(int[] edges) {
        Map<Integer, Long> map = new HashMap<>();
        long maxValue = 0;
        int maxEdge = Integer.MAX_VALUE;
        long currentValue = 0;
        for (int i = 0; i< edges.length; i++){
            if(!map.containsKey(edges[i])){
                map.put(edges[i], (long) i);
                currentValue = i;
            }else {
                currentValue = map.get(edges[i]) +i;
                map.put(edges[i], currentValue);
            }
            if(currentValue > maxValue){
                maxValue = currentValue;
                maxEdge = edges[i];
            }else if(currentValue == maxValue){
                maxEdge = Math.min(maxEdge, edges[i]);
            }
        }
        return maxEdge;
    }
}
