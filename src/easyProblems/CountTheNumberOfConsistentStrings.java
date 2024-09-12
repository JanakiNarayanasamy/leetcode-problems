package easyProblems;

public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = {"a","b","c","ab","ac","bc","abc"};
        System.out.println(countConsistentStrings(allowed, words));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int[] check = new int[128];
        boolean isConsistent = false;
        int count =0;
        for (char c:allowed.toCharArray()){
            check[c] = 1;
        }
        for(String word:words){
            for(char c:word.toCharArray()){
                if(check[c] != 1){
                    isConsistent = false;
                    break;
                }else {
                    isConsistent = true;
                }
            }
            if(isConsistent){
                count++;
            }
        }
        return count;
    }
}
