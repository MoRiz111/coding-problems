package leetcode_problems.binary_search_leetcode_problems.binary_search_lc_nc_150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * SC - O(N) - keyValueStore, N - no. of times set is called.
 */
public class LC981_TimeBasedKeyValueStore {
	Map<String, List<TimestampValue>> keyValueStore;
	
    public LC981_TimeBasedKeyValueStore() {
    	keyValueStore = new HashMap<String, List<TimestampValue>>();
    }
    
    public void set(String key, String value, int timestamp) {
        keyValueStore.computeIfAbsent(key, 
        		val -> new ArrayList<TimestampValue>()).add(new TimestampValue(value, timestamp));
    }
    
    /**
     * TC - O(logN)
     */
    public String get(String key, int timestamp) {
    	String res = "";
    	List<TimestampValue> valueList = keyValueStore.get(key);
    	
    	if (valueList == null) {
    		return res;
    	}
    	
    	int l = 0;
    	int r = valueList.size()-1;
    	
    	while (l <= r) {
    		int m = (r-l)/2 + l;
    		
    		if (valueList.get(m).getTimestamp() == timestamp) {
    			res = valueList.get(m).getValue();
    			return res;
    		} else if (valueList.get(m).getTimestamp() < timestamp) {
    			l = m+1;
    			res = valueList.get(m).getValue();
    		} else {
    			r = m-1;
    		}
    	}
    	
        return res;
    }
}

class TimestampValue {
	String value;
	int timestamp;
	
	TimestampValue(String value, int timestamp) {
		this.value = value;
		this.timestamp = timestamp;
	}

	public String getValue() {
		return value;
	}

	public int getTimestamp() {
		return timestamp;
	}
}
