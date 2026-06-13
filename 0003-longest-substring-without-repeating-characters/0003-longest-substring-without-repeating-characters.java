class Solution {
    public int lengthOfLongestSubstring(String s) {

        /* first check the character is in the hashSet or not, if it conatins remove the left character and increment the left pointer, if it doesnot contain add it in hashSet and update the answer variable and inecrement the right pointer. */
      
        if(s==null || s.length()==0) {
            return 0;
        }
         if(s.length()==1) {
            return 1;
        }
          int left=0;
          int right=0;
          int ans=0;
          HashSet<Character> hs= new HashSet<>();
          while(right<s.length()) {
            char ch= s.charAt(right);
            while(hs.contains(ch)) {
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(ch);
            ans= Math.max(ans,right-left+1);
            right++;
          }
          return ans;
        
    }
}