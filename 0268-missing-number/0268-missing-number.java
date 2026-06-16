class Solution {
    public int missingNumber(int[] nums) {
       /*
       // Approach-1
        int n= nums.length;
        int total_sum_range= n*(n+1)/2;
        int sum=0;
        for(int i=0;i<n;i++) {
         sum=sium+i;

        }
        return total_sum_range-sum;

*/
// Approach-2 - using XOR
       int xor= nums.length;
         for(int i=0;i<nums.length;i++) {
         xor^=i;
         xor^= nums[i];
         }

         return xor;
    }
}