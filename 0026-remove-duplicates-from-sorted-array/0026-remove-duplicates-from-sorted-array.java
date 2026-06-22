class Solution {
     public  int removeDuplicates(int[] arr) {
        int k=1;
        int p=arr[0];
        for (int i = 1; i <arr.length; i++) {
            if (p==arr[i]){
                continue;
            }else {
                arr[k++]=arr[i];
            }
            p=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        return k;
    }
}