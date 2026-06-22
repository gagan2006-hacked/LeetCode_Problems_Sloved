class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []arr=merge(nums1,nums2);
        return modBinSearch(arr);
    }
    public static int[] merge(int[]arr1,int[]arr2){
        int i=0;
        int j=0;
        int k=0;
        int[]result=new int[arr1.length+arr2.length];
        while (i<arr1.length && j<arr2.length){
            if (arr1[i]>arr2[j]){
                result[k++]=arr2[j++];
            }else {
                result[k++]=arr1[i++];
            }
        }
        while (i==arr1.length && j<arr2.length){
            result[k++]=arr2[j++];
        }
        while (j==arr2.length && i<arr1.length){
            result[k++]=arr1[i++];
        }
        return result;
    }
    public static double modBinSearch(int[]arr){
        int s=0;
        int end=arr.length-1;
        if (arr.length==1){
            return  arr[0];
        }
        int mid=(s+end)/2;
        if (arr.length%2==1){
            return arr[mid];
        }
        double result= ((double) (arr[mid])+(double)(arr[mid+1]))/2;

        return result ;
    }
}