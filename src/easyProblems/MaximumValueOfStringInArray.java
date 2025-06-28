package easyProblems;

public class MaximumValueOfStringInArray {
    public static void main(String[] args) {
        String[] strs = {"alic3","bob","3","4","00000"};
        System.out.println(maximumValue(strs));
    }

    public static int maximumValue(String[] strs) {
        int maxValue = Integer.MIN_VALUE;
        for (int i =0; i<strs.length; i++){
            if(strs[i].matches("\\d+")){
                maxValue = Math.max(maxValue, Integer.valueOf(strs[i]));
            }else {
                maxValue = Math.max(maxValue, strs[i].length());
            }
        }
        return  maxValue;
    }
    public static int maximumValue1(String[] strs) {
        int maxValue = Integer.MIN_VALUE;
        for (String str : strs) {
            boolean isNumeric = true;
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isDigit(str.charAt(i))) {
                    isNumeric = false;
                    break;
                }
            }
            if (isNumeric) {
                maxValue = Math.max(maxValue, Integer.parseInt(str)); // No boxing
            } else {
                maxValue = Math.max(maxValue, str.length());
            }
        }
        return maxValue;
    }
}
