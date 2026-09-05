class Solution {
    public int removeDuplicates(int[] arr) {
      int write = 0;
        for (int r = 0; r < arr.length; r++) {
            if (write < 2 || arr[r] != arr[write - 2]) {
                arr[write] = arr[r];
                write++;
            }
        }
        return write;
    }
}

