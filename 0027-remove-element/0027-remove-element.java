class Solution {
    public  int removeElement(int[] arr, int val) {
        int n=0;
        int i=0;
        while(i<arr.length){
            if (arr[i]!=val){
                arr[n++]=arr[i];
            }
            i++;
        }
        return n;
    }
}