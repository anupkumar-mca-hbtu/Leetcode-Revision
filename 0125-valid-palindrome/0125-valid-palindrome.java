class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (s.length()==0 || s.length()==1) {
            return true;
        }
        int high= s.length()-1, low=0;
        while(low<=high) {
            if(s.charAt(low)!=s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}