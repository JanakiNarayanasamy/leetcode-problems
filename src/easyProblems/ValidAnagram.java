package easyProblems;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram1(s, t));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }else {
            int[] arr1 = new int[26];
            int[] arr2 = new int[26];
            char[] c1 = s.toCharArray();
            char[] c2 = t.toCharArray();
            for (int i = 0; i < c1.length; i++) {
                arr1[c1[i] - 'a'] += 1;
                arr2[c2[i] - 'a'] += 1;
            }
            return Arrays.equals(arr1, arr2);
        }
    }
    public static boolean isAnagram1(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }else {
            int[] count = new int[26];
            for (int i =0 ; i< s.length(); i++){
                count[s.charAt(i) - 'a']++;
                count[t.charAt(i) - 'a']--;
            }
            for (int val:count){
                if(val != 0){
                    return false;
                }
            }
            return true;
        }
    }
}
