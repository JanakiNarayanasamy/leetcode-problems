import java.util.Arrays;

public class BuyTwoChocolates {
    public static void main(String[] args) {
        int[] prices = {1,2,2};
        int money = 3;
        System.out.println(buyChoco(prices,money));
    }
    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum =prices[0]+prices[1];
        if( sum > money){
            return money;
        }else {
            return money- sum;
        }
    }
}
