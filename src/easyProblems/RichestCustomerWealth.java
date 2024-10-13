package easyProblems;

public class RichestCustomerWealth {
    public static void main(String[] args) {
       int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        int current = 0;
        for(int i =0; i < accounts.length; i++){
            for(int j =0; j < accounts[0].length; j++){
                current += accounts[i][j];
            }
            max = Math.max(current, max);
            current = 0;
        }
        return max;
    }
}
