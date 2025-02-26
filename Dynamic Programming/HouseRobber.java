class HouseRobber {
    int dp[] = new int[100];
    public int rob(int[] nums) {
        dp[0]=nums[0];
        if(nums.length>1)
            dp[1]=Math.max(nums[0],nums[1]);
        if(nums.length>2)
        dp[2]=Math.max(nums[2]+nums[0], nums[1]);
        for(int i=3;i<nums.length;i++){
            if(dp[i]==0){
                dp[i] = Math.max(nums[i]+dp[i-2], nums[i-1]+dp[i-3]);
            }
        }
        return dp[nums.length-1];
    }
}