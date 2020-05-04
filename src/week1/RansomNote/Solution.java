package week1.RansomNote;

import java.util.HashMap;
import java.util.Map;

class Solution {
	
	public static void main(String[] args) {
		System.out.println(canConstruct("aa", "ab"));
	}
	
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        
        for(Character ms: magazine.toCharArray()) {
            if(hm.get(ms)!= null) {
                hm.put(ms, hm.get(ms) + 1);
            } else {
                hm.put(ms, 1);
            }
        }
        
        for(Character rs: ransomNote.toCharArray()) {
            if(hm.get(rs)!= null && hm.get(rs) > 0) {
                hm.put(rs, hm.get(rs) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
