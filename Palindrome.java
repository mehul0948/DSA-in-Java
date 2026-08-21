class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int revNumber = 0;
        while (x > 0) {
            int lastDigit = x % 10;
            revNumber = revNumber * 10 + lastDigit;
            x = x / 10;
        }
        if (revNumber == original) {
            return true;
        }
        else {
            return false;
        }
    }
}

public class Palindrome{
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.isPalindrome(222));
    }
}