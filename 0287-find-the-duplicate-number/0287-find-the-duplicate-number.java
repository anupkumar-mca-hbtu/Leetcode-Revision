class Solution {
    public int findDuplicate(int[] nums) {
        /*
        // Better approach but takes O(n) Space Complexity
        HashSet<Integer> hs = new HashSet<>();
        for(int num: nums) {
            if(!hs.add(num)) {
                return num;
            }
        }
        return 0;
        */

        // Optimal approach-  Floyd's Tortoise and Hare
        int slow = nums[0];
        int fast = nums[0]; 
        do { 
            slow = nums[slow]; 
            fast = nums[nums[fast]];
             } while(slow != fast);
             
             slow = nums[0];
             while(slow != fast) {
                 slow = nums[slow]; 
                 fast = nums[fast];
                  }
                   return slow;
    }
}