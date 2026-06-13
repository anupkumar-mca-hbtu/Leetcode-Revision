class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max_Sum=Integer.MIN_VALUE;;
        // for(int i=0;i<nums.length;i++) {
        //     sum=0;
        //     for(int j=i;j<nums.length;j++) {
        //      sum+=nums[j];
        //      max_Sum= Math.max(max_Sum,sum);
        //     }
        // }
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
            max_Sum= Math.max(max_Sum,sum);
            if(sum<0) {
                sum=0;
            }
            
        }
        return max_Sum;
    }
}