class Solution {
    public boolean isPalindrome(int x) {
        int y=0;
        int z=x;
        while(x>0) {
       y=y*10+ (x%10);
       x=x/10;
        }
        if(z==y) {
            return true;
        }
 return false;
    }
}