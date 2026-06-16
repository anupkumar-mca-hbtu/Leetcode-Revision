class Solution {
    public void nextPermutation(int[] nums) {
         int pivot = -1;

        // Step 1: Find pivot
        for(int i = nums.length - 2; i >= 0; i--) {

            if(nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: Find just larger element
        if(pivot != -1) {

            for(int i = nums.length - 1; i > pivot; i--) {

                if(nums[i] > nums[pivot]) {

                    int temp = nums[i];
                    nums[i] = nums[pivot];
                    nums[pivot] = temp;

                    break;
                }
            }
        }
        swap(nums, pivot + 1, nums.length - 1);
    }
    public void swap(int[] num, int left, int right) {
       while(left<=right) {
        int temp= num[left];
        num[left]= num[right];
        num[right]= temp;
        left++;
        right--;
    

       }   
        }
}