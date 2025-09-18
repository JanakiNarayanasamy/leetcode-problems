package easyProblems;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "ab_a";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String replacedString = s.replaceAll("[^a-zA-Z0-9]","");
        String finalString = replacedString.toLowerCase();
        int left =0;
        int right =finalString.length()-1;
        while (left < right){
            if (finalString.charAt(left) != finalString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
