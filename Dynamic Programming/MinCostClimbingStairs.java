class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length+1];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<=cost.length;i++){
            if(i==cost.length){
                dp[i]=Math.min(dp[i-2],dp[i-1]);
            }else{
                dp[i]=Math.min(dp[i-2]+cost[i],dp[i-1]+cost[i]);
            }
        }
        return dp[cost.length];
    }
}