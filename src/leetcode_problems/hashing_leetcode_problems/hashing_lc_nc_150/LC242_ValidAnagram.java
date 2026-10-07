package leetcode_problems.hashing_leetcode_problems.hashing_lc_nc_150;

import java.util.HashMap;
import java.util.Map;

/**
 * Hashing
 * TC - O(N)
 * SC - O(26) -> O(1)
 */
public class LC242_ValidAnagram {
	public boolean isAnagramEfficient(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        if (sLen != tLen) {
            return false;
        }

        int[] sFrq = new int[26];
        int[] tFrq = new int[26];

        for (int i=0; i<sLen; i++) {
            sFrq[s.charAt(i)-'a']++;
            tFrq[t.charAt(i)-'a']++;
        }

        for (char c: s.toCharArray()) {
            if (sFrq[c-'a'] != tFrq[c-'a']) {
                return false;
            }
        }

        return true;

    }
	
	public boolean isAnagramUsingHashMap(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        if (sLen != tLen) {
            return false;
        }
        
        Map<Character, Integer> sFrq = new HashMap<Character, Integer>();
        Map<Character, Integer> tFrq = new HashMap<Character, Integer>();
        
        for (int i=0; i<sLen; i++) {
            sFrq.put(s.charAt(i), sFrq.getOrDefault(s.charAt(i), 0)+1);
            tFrq.put(t.charAt(i), tFrq.getOrDefault(t.charAt(i), 0)+1);
        }
        
        for (char c: s.toCharArray()) {
            if (sFrq.get(c) != tFrq.get(c)) {
                return false;
            }
        }
        
        return true;
	}
}
