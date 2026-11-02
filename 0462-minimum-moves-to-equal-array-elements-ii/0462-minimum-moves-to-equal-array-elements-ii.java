class Solution {
    public int minMoves2(int[] nums) {
       Arrays.sort(nums);
       int moves=0;
       int med=nums[nums.length/2];
       for(int x: nums)
       {
           moves+=Math.abs(x-med);
       }
       return (int) moves;
    }
}