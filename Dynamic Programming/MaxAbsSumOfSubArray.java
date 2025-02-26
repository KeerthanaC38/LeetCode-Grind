class MaxAbsSumOfSubArray {
    public int maxAbsoluteSum(int[] nums) {
        int max_sum = 0, min_sum=0, max_ending_here = 0, min_ending_here = 0;
        for(int num:nums){
            max_ending_here+=num;
            min_ending_here+=num;
            max_sum=Math.max(max_ending_here,max_sum);
            min_sum=Math.min(min_ending_here,min_sum);
            if(max_ending_here<0)max_ending_here=0;
            if(min_ending_here>0)min_ending_here=0;
        }
        return Math.max(max_sum,Math.abs(min_sum));
    }
}