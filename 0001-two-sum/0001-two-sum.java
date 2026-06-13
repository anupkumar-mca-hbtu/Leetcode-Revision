class Solution {
    public int[] twoSum(int[] nums, int target) {
        
    //     int arr[]= new int[2];
    //     int z=0;
    //     HashSet<Integer>hs= new HashSet<>();
    //     for(int i=0;i<nums.length;i++) {
    //         if(hs.contains(target-nums[i])) {
    //             arr[1]=i;
    //             z= target-nums[i];
    //             break;
    //         }
    //         else {
    //             hs.add(nums[i]);
    //         }
    //     }
    //     for(int i=0;i<nums.length;i++) {
    //         if(nums[i]==z) {
    //            arr[0]=i;
    //            break;
    //         }
    //     }
    //     return arr;
    // }

    HashMap<Integer,Integer> hm= new HashMap<>();
    for(int i=0;i<nums.length;i++) {

        int rem= target-nums[i];
        if(hm.containsKey(rem)) {
            return new int[] {hm.get(rem),i};
        }
        hm.put(nums[i],i);
    }
    return new int[] {};
}
}