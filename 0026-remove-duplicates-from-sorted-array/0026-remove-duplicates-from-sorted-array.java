class Solution {
    public static int removeDuplicates(int[] arr) {
        int prev=arr[0];
        int curr=1;
        for (int i = 1; i <arr.length; i++) {
            if (prev!=arr[i]){
                int t=curr;
                arr[curr++]=arr[i];
                prev=arr[t];
            }
        }
        // System.out.println(Arrays.toString(Arrays.copyOf(arr,curr)));
        return curr;
    }
}