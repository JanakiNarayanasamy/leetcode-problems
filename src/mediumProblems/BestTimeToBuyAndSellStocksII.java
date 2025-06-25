package mediumProblems;

public class BestTimeToBuyAndSellStocksII {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int current = prices[0];
        int sum=0;
        for (int i=1; i< prices.length; i++){
            if(prices[i]>current){
                sum += prices[i] -current;
                current = prices[i];
            }else {
                current = prices[i];
            }
        }
        return sum;
    }
}
