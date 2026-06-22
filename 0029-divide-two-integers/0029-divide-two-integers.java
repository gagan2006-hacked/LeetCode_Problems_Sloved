class Solution {
    public static int divide(int div, int d) {
        if (div==-2147483648 && d==-1){
            return 2147483647;
        }
        long l=(div/d);
        return (int)(l);
    }
}