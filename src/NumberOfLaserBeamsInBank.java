public class NumberOfLaserBeamsInBank {
    public static void main(String[] args) {
        String[] s ={"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(s));
    }
    public static int numberOfBeams(String[] bank) {
        int prev = 0;
        int res=0;
        for (int i =0; i < bank.length; i++){
            int count =0;
            char[] s = bank[i].toCharArray();
            for (int j =0; j < s.length; j++){
                if(s[j] == '1'){
                    count++;
                }
            }if(count !=0) {
                res  += count * prev;
                prev = count;
            }
        }
        return res;
    }
}
