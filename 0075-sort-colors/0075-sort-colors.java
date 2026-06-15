class Solution {
    public void sortColors(int[] nums) {
        int low=0, high= nums.length-1;
        int move= low;

        while(move<=high) {
            if(nums[move]==2) {
                int temp= nums[high];
                nums[high]= nums[move];
                nums[move]= temp;
              
                high--;

            } else if(nums[move]==0) {
                int temp= nums[low];
                nums[low]= nums[move];
                nums[move]= temp;
                move++;
                low++;
            } else {
                move++;
            }
        }


    }
}