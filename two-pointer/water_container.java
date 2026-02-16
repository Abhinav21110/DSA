class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int max = 0;
        while(l<r){
            if(height[l]>=height[r]){
                if(max <= height[r]*(r-l)){
                    max = height[r]*(r-l);
                }
                r--;
            }
            else{
                if(max <= height[l]*(r-l)){
                    max = height[l]*(r-l);
                }
                l++;
            }
        }
        return max;
    }
}