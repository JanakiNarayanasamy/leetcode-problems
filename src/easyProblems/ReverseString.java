package easyProblems;

public class ReverseString {
    public static void main(String[] args) {
         char[] s = {'h','e','l','l','o'};
        System.out.println(s);
         reverseString(s);
    }
    public static void reverseString(char[] s) {
        char temp = '.';
        int left = 0;
        int right = s.length-1;
        while (left < right){
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.println(s);
    }
}
