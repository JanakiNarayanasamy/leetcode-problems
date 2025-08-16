package easyProblems;

import java.util.Arrays;

public class CheckDistancesBetweenSameLetters {
    public static void main(String[] args) {
        String s = "aa";
        int[] distance = {1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(checkDistances(s, distance));
    }
    public static boolean checkDistances(String s, int[] distance) {
        int[] index= new int[26];
        Arrays.fill(index, -1);
        int i = 0;
        int diff = 0;
        for (char ch: s.toCharArray()){
            int num = ch - 'a';
            if(index[num] == -1){
                index[num] = i;
            }else {
                diff = i - index[num] - 1;
                if(diff != distance[num]) return false;
            }
            i++;
        }
        return true;
    }
}
