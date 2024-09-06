package mediumProblems;

public class StudentReplaceChalk {
    public static void main(String[] args) {
        int[] chalk = {5,1,5};
        int k = 22;
        System.out.println(chalkReplacer(chalk,k));
    }
    public static int chalkReplacer(int[] chalk, int k) {
        int i =0;
        while (k >= chalk[i]){
            k = k -chalk[i];
            i++;
            if(i == chalk.length){
                i =0;
            }

        }
        return i;
    }
}
