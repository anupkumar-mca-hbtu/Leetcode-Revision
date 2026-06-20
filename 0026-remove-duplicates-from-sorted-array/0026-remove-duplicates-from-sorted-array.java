class Solution {
    public int removeDuplicates(int[] nums) {
      int prev=0;
      
      for(int i=1;i<nums.length;i++) {
         if(nums[i-1]!=nums[i]) {
            nums[++prev]= nums[i];
         }
      }
      return prev+1;

    }
}