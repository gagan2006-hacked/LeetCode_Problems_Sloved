class Solution {
    public static int removeElement(int[] nums, int val) {
        int index=0,i=0;
        while (i<nums.length){
            if (nums[i]!=val){
                nums[index++]=nums[i];
            }
            i++;
        }
        return index;
    }
}