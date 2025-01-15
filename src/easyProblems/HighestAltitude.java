package easyProblems;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain ={-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int res =0;
        int sum =0;
        for (int i=0; i< gain.length; i++){
            sum += gain[i];
            res = Math.max(res, sum);
        }
        return res;
    }
}
