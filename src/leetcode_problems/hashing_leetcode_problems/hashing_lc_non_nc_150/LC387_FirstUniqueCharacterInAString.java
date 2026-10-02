package leetcode_problems.hashing_leetcode_problems.hashing_lc_non_nc_150;

/**
 * Hashing
 * TC - O(2N) -> O(N)
 * SC - O(26) -> O(1)
 * 
 */
public class LC387_FirstUniqueCharacterInAString {
	public int firstUniqChar(String s) {
        int[] arr = new int[26];

        for (char c: s.toCharArray()) {
            arr[c-'a']++;
        }

        for (int i=0; i<s.length(); i++) {
            if (arr[s.charAt(i)-'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
