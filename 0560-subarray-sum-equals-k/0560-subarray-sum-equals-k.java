class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int prefix_Sum=0;
        hm.put(0,1);

       for(int i=0;i<nums.length;i++) {
         prefix_Sum= prefix_Sum+ nums[i];
         if(hm.containsKey(prefix_Sum-k)) {
            count+=hm.get(prefix_Sum-k);
         }
         hm.put(prefix_Sum, hm.getOrDefault(prefix_Sum,0)+1);
       }
       return count;
    }
}