package mediumProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxDistanceInArrays {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,4,5);
        List<Integer> list2 = Arrays.asList(0,2);
        List<Integer> list3 = Arrays.asList(1,2,3);
        List<List<Integer>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        //list.add(list3);
        System.out.println(maxDistance(list));
    }
    public static int maxDistance(List<List<Integer>> arrays) {
        int max = 0;
        int size = arrays.size();
        for (int i=0; i < size;i++ ){
            int len2 = arrays.get(i).size();
            int iFirst = arrays.get(i).get(0);
            int iLast = arrays.get(i).get(len2-1);
            int j =  i+1;
            while (j < arrays.size()){
                int len = arrays.get(j).size();
                int val = Math.abs(arrays.get(j).get(len-1)- iFirst);
                int val2 = Math.abs( iLast- arrays.get(j).get(0));
                int valF = Math.max(val,val2);
                if(valF > max){
                    max = valF;
                }
                j++;
            }
        }
        return max;
    }
}
