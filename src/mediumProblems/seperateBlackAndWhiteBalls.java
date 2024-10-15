package mediumProblems;

public class seperateBlackAndWhiteBalls {
    public static void main(String[] args) {
       String s = "11000111";
        System.out.println(minimumSteps(s));
    }
    public static long minimumSteps(String s) {
        int n= s.length();
        int zeroCount = 0;
        long count = 0;
        char[] chs= s.toCharArray();
        for(int i= n-1; i >= 0; i-- ){
            if(chs[i]=='0'){
                zeroCount++;
            }else if(chs[i] == '1'){
                if(zeroCount != 0){
                    count += zeroCount;
                }
            }
        }

        return count;
    }
}
