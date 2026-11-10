package leetcode_problems.array_leetcode_problems.array_lc_nc_150;

import java.util.Arrays;
import java.util.List;

public class LC271_EncodeAndDecodeStrings {
    public String encode(List<String> strs) {
    	StringBuilder str = new StringBuilder();
    	
    	for (String elt: strs) {
    		str.append(elt).append(",");
    	}
    	
    	return str.toString();
    }

    public List<String> decode(String str) {
    	String[] strs = str.split(",");
    	
    	return Arrays.asList(strs);
    }
}
