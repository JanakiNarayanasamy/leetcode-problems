public class MaximumOddBinaryNumber {
    public static void main(String[] args) {
        String s= "0101";
        System.out.println(maximumOddBinaryNumber(s));
    }

    public static String maximumOddBinaryNumber(String s) {
        StringBuilder res= new StringBuilder();
        int count =0;
        int count1= 0;
        char[] ch= s.toCharArray();
        for (Character i: ch){
            if(i == '1'){
                count++;
            }
        }
        if (count > 0){
            for (int i=0; i< count-1; i++){
               res.append('1');
            }
            count1 = s.length()-count;
            for (int i=0; i< count1; i++){
                res.append('0');
            }
            res.append('1');
            return res.toString();
        }else {
            return s;
        }
    }
}
