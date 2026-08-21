// Reverse the numbers from the input which is giver by the user

class Solution {
    public int reverse(int x) {
        int revNum = 0;
        if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
        while (x > 0 || x < 0) {
            int lastDigit = x % 10;
            revNum = revNum * 10 + lastDigit;
            x = x / 10;
        }
        return revNum;
        }
        else{
            return 0;
        }
    }
}

public class Reverse_the_numbers {
    public static void main(String[] args){
        Solution obj = new Solution();
        System.out.println(obj.reverse(-559809954));
    }
}
