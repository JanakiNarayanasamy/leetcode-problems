package easyProblems;

public class NumberOfSeniorCitizens {
    public static void main(String[] args) {
        String[] array = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(array));
    }

    public static int countSeniors(String[] details) {
        int count =0 ;
        for (String s:details){
            int i = Integer.parseInt(s.substring(11,13));
            if(i > 60 ) count++;
        }
        return count;
    }
}
