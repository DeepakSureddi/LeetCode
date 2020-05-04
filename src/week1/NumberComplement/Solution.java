package week1.NumberComplement;

public class Solution {
    public static int findComplement(int num) {
        return ~num & (Integer.highestOneBit(num) - 1);
    }
    
    public static void main(String[] args) {
		System.out.println(findComplement(5));
	}
}