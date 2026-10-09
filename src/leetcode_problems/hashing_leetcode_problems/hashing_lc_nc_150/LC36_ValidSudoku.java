package leetcode_problems.hashing_leetcode_problems.hashing_lc_nc_150;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Hashing (HashMap & HashSet)
 * TC - O(N^2)
 * SC - O(N^2)
 * (technically SC and TC are constant O(1) as sudoku board is always 9*9 - O(81))
 */
public class LC36_ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		int size = board.length;
        
        Map<Integer, Set<Integer>> rowMap = new HashMap<Integer, Set<Integer>>();
        Map<Integer, Set<Integer>> colMap = new HashMap<Integer, Set<Integer>>();
        Map<Integer, Set<Integer>> boxMap = new HashMap<Integer, Set<Integer>>();
        
        for (int i=0; i<size; i++) {
        	rowMap.put(i, new HashSet<Integer>());
        	colMap.put(i, new HashSet<Integer>());
        	boxMap.put(i, new HashSet<Integer>());
        }
		
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				int ch = board[i][j];
				int boxIndex = (i/3)*3 + (j/3);
				
				if (ch != '.') {
					
					int num = Character.getNumericValue(ch);
					
					if ((!rowMap.get(i).add(num)) ||
							(!colMap.get(j).add(num)) || 
							(!boxMap.get(boxIndex).add(num))) {
						return false;
					}
				}
			}
		}
		
		return true;
    }
}
