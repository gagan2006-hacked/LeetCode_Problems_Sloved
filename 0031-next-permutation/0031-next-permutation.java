class Solution {
    public static void nextPermutation(int[] nums) {
        int ind=-1,n=nums.length;
        for (int i = n-2; i >=0; i--) {
            if (nums[i]<nums[i+1])
            {
                ind=i;
                break;
            }
//                {1,2,3,4,5,6}
//                {6,5,4,3,2,1}
        }
        if (ind==-1){
            reverse(nums,0,n-1);
            return;
        }
        for (int i = n-1; i>ind; i--) {
            if (nums[ind]<nums[i]){
                swapTheGreate(nums,ind,i);
                break;
            }
        }
        reverse(nums,ind+1,n-1);
    }

    private static void swapTheGreate(int[] nums, int i,int j) {
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
    }

    private static  void reverse(int []arr,int s,int e){
        while (s<e){
            swapTheGreate(arr,s,e);
            s++;
            e--;
        }
    }
}