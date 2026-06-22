class Solution {
       public static boolean isPalindrome(int x) {
        int orginal=x;
        int reverse=0;
        if(x<0) return false;
        while(x!=0){
            int digit = x % 10;
            reverse = reverse*10+digit;
            x=x/10;
        }
        return orginal == reverse;

    }

}