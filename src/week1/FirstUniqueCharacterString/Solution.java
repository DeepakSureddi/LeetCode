package week1.FirstUniqueCharacterString;

class Solution {
    public static int firstUniqChar(String s) {
        int[] arr = new int[26];
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length ; i++) {
            arr[c[i] - 97]++;
        }
        for(int j = 0; j < c.length; j++) {
            if(arr[c[j] - 97] == 1) {
                return j;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
		System.out.println(firstUniqChar("loveleetcode"));
	}
}