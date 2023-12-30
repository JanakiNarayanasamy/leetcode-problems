public class RedistributeCharactersToMakeAllStringsEqual {
    public static void main(String[] args) {
        String[] words = {"abc","aabc","bc"};
        System.out.println(makeEqual(words));
    }
    public static boolean makeEqual(String[] words) {
        if(words.length == 1){
            return true;
        }
        int[] arr = new int[26];
        for (int i =0; i < words.length;i++){
            for (int j =0; j< words[i].length(); j++){
                arr[words[i].charAt(j) - 'a'] += 1;
            }
        }
        for (int i =0; i < arr.length; i++){
            if(arr[i]% words.length !=0){
                return false;
            }
        }
        return true;
    }
}

