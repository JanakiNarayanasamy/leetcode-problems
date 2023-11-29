public class isPalindrome {
    public static boolean isPalindrome(int x) {
        int y =x;
        int temp =0;
        int result =0;
        while (x > 0){
            temp = x % 10;
            x = x /10;
            result = result * 10 +  temp;
        }
        System.out.println(result);
        if(y == result){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(454));
    }
}
