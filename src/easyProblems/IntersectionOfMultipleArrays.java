package easyProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class IntersectionOfMultipleArrays {
    public static void main(String[] args) {
        int[][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        System.out.println(intersection(nums));
    }
    public static List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map= new TreeMap<>();
        for (int i=0;i< nums.length; i++){
            for (int j=0; j< nums[i].length;j++){
                map.merge(nums[i][j], 1, Integer::sum);
            }
        }
        List<Integer> list= new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == nums.length){
                list.add(entry.getKey());
            }
        }
        return list;
    }


}
