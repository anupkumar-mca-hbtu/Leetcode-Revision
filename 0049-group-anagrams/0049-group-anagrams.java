class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
//         List<List<String>> ls= new ArrayList<>();
//         for(int i=0;i<strs.length;i++) {
//             ArrayList<String> al= new ArrayList<>();
//            if(strs[i]=="0") {
//               continue;
//            }
//             al.add(strs[i]);
//             for(int j=i+1;j<strs.length;j++) {
//             boolean res= isAnagram(strs[i], strs[j]);
//             if(res) {
//                 al.add(strs[j]);
//                  strs[j]="0";
//             }
           
//         //    System.out.println(res + " "+strs[i] +" "+strs[j]);
//             }
//             ls.add(al);
//         }
//         return ls;
//     }
//     public boolean isAnagram(String str1, String str2) {
//         int[] arr= new int[256];
//         if(str1.length()!=str2.length()) {
//                 return false;
//             }
        
//         for(int i=0;i<str1.length();i++) {
            
//             arr[str1.charAt(i)]++;
//             arr[str2.charAt(i)]--;

//         }
//         for(int i=0;i<arr.length;i++) {
//              if(arr[i]!=0) {
//                 return false;
//              }
//         }
//         return true;
//     }
// }

//----- Optimal solution using HashMap
        HashMap<String,List<String>> hm= new HashMap<>();
         for(String str: strs) {
            char[] st= str.toCharArray();
            Arrays.sort(st);
            String s= new String(st);
            if(!hm.containsKey(s)) {
                hm.put(s, new ArrayList<>());
            }
            hm.get(s).add(str);

         }
         return new ArrayList<>(hm.values());
    }
}