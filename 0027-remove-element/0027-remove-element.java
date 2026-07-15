class Solution {
    public static int removeElement(int[] nums, int val) {
        int count=0;
        int index= nums.length-1,i=0;
        while (i< nums.length&&i<=index){

            if (nums[i]==val){
                count++;
                int t=nums[index];
                nums[index]=nums[i];
                nums[i]=t;
                index--;
                continue;
            }
            i++;
        }
        System.out.println(Arrays.toString(nums));
        return nums.length-count;
    }
}