public class LargestSubstringBetweenTwoEqualCharacters {
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }
    public static int maxLengthBetweenEqualCharacters(String s) {
        char[] arr = s.toCharArray();
        int[] indexArray= new int[27];
        int max = -1;
        for (int i=0; i < arr.length; i++){
            if(indexArray[arr[i] - 'a'] == 0){
                indexArray[arr[i] -'a'] = i+1;
            }else{
              max = Math.max(max, (i - indexArray[arr[i] -'a']));
            }
        }

        return max;
    }
}
