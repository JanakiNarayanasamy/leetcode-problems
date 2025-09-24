package easyProblems;

public class FindFirstOccuranceOfString {
    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad1";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
