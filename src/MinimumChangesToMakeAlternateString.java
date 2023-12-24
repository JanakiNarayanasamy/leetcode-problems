public class MinimumChangesToMakeAlternateString {
    public static void main(String[] args) {
        String s ="10010100";
        System.out.println(minOperations(s));
    }
    public static int minOperations(String s) {
        int count=0;
        int count1=0;
        int n= s.length();
        char[] ch= s.toCharArray();
        for (int i=0; i< n; i++){
            if(i%2 ==0){
                if(ch[i] == '0'){
                    count++;
                }else {
                    count1++;
                }
            }else {
                if(ch[i] == '0'){
                    count1++;
                }else {
                    count++;
                }
            }
        }
        return Math.min(count,count1);
    }

    public static int minOperations1(String s){
        int count=0;
        int count1=0;
        int n= s.length();
        char[] ch= s.toCharArray();
        for (int i=0; i< n; i++){
            char currentChar = ch[i];
            char c1 = (i % 2 == 0) ? '0' : '1';
            char c2 = (i % 2 == 0) ? '1' : '0';
            if (currentChar != c1) {
                count++;
            }
            if (currentChar != c2) {
                count1++;
            }

        }
        return Math.min(count,count1);
    }
}
