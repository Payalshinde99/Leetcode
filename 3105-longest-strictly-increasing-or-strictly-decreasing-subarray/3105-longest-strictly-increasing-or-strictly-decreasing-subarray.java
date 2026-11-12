class Solution {
    public int longestMonotonicSubarray(int[] nums) {
       int maxlength=1;
       int inclength =1;
       int declength=1;
       for(int pos=0;pos<nums.length-1;pos++)
       {
        if(nums[pos+1]>nums[pos])
        {
            inclength++;
            declength=1;
        }
        else if(nums[pos]>nums[pos+1])
        {
            declength++;
            inclength=1;
        }
        else
        {
            inclength=1;
            declength=1;
        }
        maxlength=Math.max(maxlength,Math.max(inclength,declength));
       } 
       return maxlength;
    }
}