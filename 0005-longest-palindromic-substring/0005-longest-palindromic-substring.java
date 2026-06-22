class Solution {
    public  String longestPalindrome(String s) {
//        return helper(s);
        String v="";
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            if (!v.isEmpty()){
                if (v.length()>=s.length()){
                    return v;
                }
            }
            if (s.charAt(start)==s.charAt(end)){
                if(isPalin(start, end, s) && (end - start + 1) > v.length()){
                    v=s.substring(start,end+1);
                }
            }
            if (end==start){
                start=start+1;
                end=s.length()-1;
                continue;
            }
            end--;
        }
        return (s.length()==1)?s:v;
    }

    private static boolean isPalin(int start, int end, String s) {
        while (start<end){
            if (s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
