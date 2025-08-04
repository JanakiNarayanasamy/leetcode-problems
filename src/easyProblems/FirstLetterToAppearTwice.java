package easyProblems;

public class FirstLetterToAppearTwice {
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }
    public static char repeatedCharacter(String s) {
        int[] array= new int[26];
        for (char ch:s.toCharArray()){
            if(array[ch-'a'] != 0){
                return ch;
            }else {
                array[ch-'a']++;
            }

        }
        return Character.MAX_VALUE;
    }
}
