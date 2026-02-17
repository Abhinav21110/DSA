class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                set.add(i);
            }
            else{
                set.clear();
            }
            max = Math.max(max, set.size());
        }
        return max;
    }
}