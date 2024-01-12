public class StringHalvesAlike {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s) {
        int firstCount=0;
        int secoundCount =0;
        char[] charArray = s.toLowerCase().toCharArray();
        int len = charArray.length/2;
        for (int i=0; i < len ; i++){
            if(charArray[i] =='a'|| charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u' ){
                firstCount++;
            }
        }
        for (int i=len; i < charArray.length ; i++){
            if(charArray[i] =='a'|| charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u' ){
                secoundCount++;
            }
        }
        return (firstCount==secoundCount);
    }

    public static boolean halvesAreAlike1(String s) {
       int len = s.length()/2;
       String firstHalf = s.substring(0,len);
       String secondHalf= s.substring(len);
       int countFirst = countVowels(firstHalf);
       int countSecond = countVowels(secondHalf);
       return (countFirst == countSecond);
    }
    private static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}
