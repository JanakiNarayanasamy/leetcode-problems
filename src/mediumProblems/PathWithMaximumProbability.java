package mediumProblems;

import java.util.*;

public class PathWithMaximumProbability {
    public static void main(String[] args) {
        int n =3;
        int[][] edges = {{0,1},{1,2},{0,2}};
        double[] succProb= {0.5, 0.5,0.2};
        int start_node = 0, end_node =2;
        System.out.println(maxProbability(n,edges,succProb,start_node,end_node));
    }

    public static double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        PriorityQueue<Tuple> heap = new PriorityQueue<>(new Tuple.TupleComparator());
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
        Map<Integer, List<Tuple>> graph = new HashMap<>();
        for (int i =0 ; i< edges.length; i++){
            int[] edge = edges[i];
            int x = edge[0];
            int y = edge[1];
            graph.computeIfAbsent(x, k-> new ArrayList<>()).add(new Tuple(succProb[i],y));
            graph.computeIfAbsent(y, k-> new ArrayList<>()).add(new Tuple(succProb[i],x));
        }
        heap.add(new Tuple(1,start_node));
        while (!heap.isEmpty()){
            Tuple curr = heap.poll();
            if(curr.node == end_node){
                return curr.prob;
            }
            if(visited[curr.node]){
                continue;
            }
            visited[curr.node] = true;
            if(graph.containsKey(curr.node)){
                for (Tuple child:graph.get(curr.node)){
                    if(!visited[child.node]){
                        heap.add(new Tuple(child.prob * curr.prob, child.node));
                    }
                }
            }
        }
        return 0;
    }


}

class Tuple{
    double prob;
    int node;

    public Tuple(double prob, int node) {
        this.prob = prob;
        this.node = node;
    }

    public static class TupleComparator implements Comparator<Tuple>{
        @Override
        public int compare(Tuple t1, Tuple t2){
            return Double.compare(t2.prob,t1.prob);
        }
    }
}
