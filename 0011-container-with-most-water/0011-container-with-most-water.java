class Solution {
   public  int maxArea(int[] height) {
        int s=0;
        int end= height.length-1;
        int area=-1;
        while (s<end){
            int newarea=Math.min(height[s],height[end])*(end-s);
            if (area<newarea){
                area=newarea;
            }
            if (height[s]>height[end]){
                end--;
            } else if (height[s]<height[end]) {
                s++;
            }else {
                s++;
            }
        }
        return area;
    }
}