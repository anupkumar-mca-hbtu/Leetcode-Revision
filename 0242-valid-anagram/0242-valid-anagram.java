class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) {
             return false;
        }
        // HashMap<Character,Integer> hm= new HashMap<>();
        // for(int i=0;i<s.length();i++) {
        //     char ch= s.charAt(i);
        //     hm.put(ch,hm.getOrDefault(ch,0)+1);
        // }
        // for(int i=0;i<t.length();i++) {
        //     char ch= t.charAt(i);
        //     if(hm.containsKey(ch)) {
        //         int val=hm.get(ch);
        //         if(val==1) {
        //             hm.remove(ch);
        //         }
        //         else {
        //             hm.put(ch, val-1);
        //         }
        //     }
        //     else {
        //         return false;
        //     }
        // }
        
        // return hm.isEmpty();


        // lets do the optimal code by taking an array of 26 capacity.
    
    int [] charCount= new int[26];
    for(int i=0;i<s.length();i++) {
        charCount[s.charAt(i)-'a']++;
        charCount[t.charAt(i)-'a']--;
    }

    for(Integer i:charCount) {
        if(i!=0) {
            return false;
        }
    }
        return true;
    }
}