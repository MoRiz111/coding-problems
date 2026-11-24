package leetcode_problems.array_leetcode_problems.array_lc_nc_150;

import java.util.ArrayList;
import java.util.List;

/**
 * Delimeter + length of every element 
 * 
 * for both methods : 
 * TC - O(L) (length of the encoded string)
 * SC - O(L) (length of the encoded string)
 */
public class LC271_EncodeAndDecodeStrings {
    public String encode(List<String> strs) {
    	StringBuilder str = new StringBuilder();
    	
    	for (String elt: strs) {
    		str.append(elt.length()).append("#").append(elt);
    	}
    	
    	return str.toString();
    }

    public List<String> decode(String str) {
    	List<String> res = new ArrayList<>();
    	int i = 0;
    	
    	while (i < str.length()) {
    		int j = i;
    		
    		while (str.charAt(j) != '#') {
    			j++;
    		}
    		
    		int size = Integer.valueOf(str.substring(i, j));
    		
    		int start = j+1;
    		int end = j+1+size;
    		res.add(str.substring(start, end));
    		
    		i = end;
    	}
    	
    	return res;
    }
}
