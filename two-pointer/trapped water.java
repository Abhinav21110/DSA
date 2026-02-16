class Solution {
    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        int sum = 0;
        int currentMax = height[0];
        for(int i=0; i<height.length; i++){
            currentMax = Math.max(currentMax, height[i]);
            leftMax[i] = currentMax;
        }
        currentMax = height[height.length-1];
        for(int i=height.length-1; i>=0; i--){
            currentMax = Math.max(currentMax, height[i]);
            rightMax[i] = currentMax;
        }
        for(int i=1; i<=height.length-2;i++){
            sum += Math.min(leftMax[i],rightMax[i])-height[i];
        }
        return sum;
    }
 }
