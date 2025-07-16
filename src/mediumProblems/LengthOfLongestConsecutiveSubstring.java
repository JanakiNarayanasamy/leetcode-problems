package mediumProblems;

public class LengthOfLongestConsecutiveSubstring {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(longestContinuousSubstring(s));
    }
    public static int longestContinuousSubstring(String s) {
        int max = 1;
        if(s.length() == 1) return 1;
        for (int i = 1 ;i< s.length(); i++){
            int count = 0;
            while (i < s.length() && s.charAt(i) - s.charAt(i-1) == 1 ){
                count++;
                max = Math.max(max, count+1);
                i++;
            }
        }
        return max;
    }
}
