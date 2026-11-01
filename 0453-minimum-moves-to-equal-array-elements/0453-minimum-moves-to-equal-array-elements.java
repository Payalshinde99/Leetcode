class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        int moves=0;
        for(int x:nums)
        {
            if(x<min)
            {
                min=x;
            }
        }
        for(int y:nums)
        {
            moves+=y-min;
        }
        return moves;
    }

}