package easyProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {2,1,5};
        int k = 806;
        System.out.println(addToArrayForm(num, k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int k1 = k;
        int n = num.length;
        List<Integer> res= new ArrayList<>();
        while (--n >=0 || k1 > 0){
            if(n >= 0)
                k1 += num[n];
            res.add(k1%10);
            k1 /= 10;
        }
        Collections.reverse(res);
        return res;
    }
}
