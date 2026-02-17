class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int sum = 0;
        for(i=0; i<k; i++){
            sum+=nums[i];
        }
        double maxSum = sum;
        for(i=k; i<nums.length; i++){
            sum-=nums[i-k];
            sum+=nums[i];
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum/k;
    }
}