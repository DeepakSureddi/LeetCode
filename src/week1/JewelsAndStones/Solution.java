package week1.JewelsAndStones;

import java.util.HashSet;
import java.util.Set;

class Solution {
    
    public int numJewelsInStones(String J, String S) {
    Set<Character> hs = new HashSet<Character>();
    for(int i = 0; i< J.length(); i++) {
        hs.add(J.charAt(i));
    }
    int count = 0;
    for(int i = 0; i< S.length(); i++) {
        if(hs.contains(S.charAt(i))) {
            count++;
        }
    }
    return count;
}

// public int numJewelsInStones(String J, String S) {
//     // char[] c = J.split("");
//     Map<Character, Integer> hm = new HashMap<Character, Integer>();
//     for(int i = 0; i< J.length(); i++) {
//         hm.put(J.charAt(i), 1);
//     }
//     int count = 0;
//     for(int i = 0; i< S.length(); i++) {
//         if(hm.get(S.charAt(i)) != null) {
//             count++;
//         }
//     }
//     return count;
// }

// public int numJewelsInStones(String J, String S) {
//     return S.replaceAll("[^" + J + "]", "").length();
// }
}