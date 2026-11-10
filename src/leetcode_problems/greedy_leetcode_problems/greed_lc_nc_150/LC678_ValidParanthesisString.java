package leetcode_problems.greedy_leetcode_problems.greed_lc_nc_150;

public class LC678_ValidParanthesisString {
    public boolean checkValidString(String s) {
       int[] freq = new int[2];
       int star = 0;
       
       for (char c: s.toCharArray()) {
    	   if (c == '(') {
    		   freq[0]++;
    	   } else if (c == ')') {
    		   freq[1]++;
    		   
    		   if (freq[1] > freq[0]) {
    			   if (freq[1]-freq[0] > star) {
    				   return false;
    			   }
    		   }
    	   } else {
    		   star++;
    	   }
       }
       
       return (Math.abs(freq[1]-freq[0])<= star);
    }
}
