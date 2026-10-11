package leetcode_problems.hashing_leetcode_problems.hashing_lc_nc_150;

/**
 * Can be done using 2 HashSets (adding zero rows and columns separately),
 * but SC - O(M + N), not efficient.
 * In place-matrix marking (most efficient)
 * TC - O(M*N)
 * SC - O(1)
 */
public class LC73_SetMatrixZeroes {
	public void setZeroes(int[][] matrix) {
		int rowLen = matrix.length;
		int colLen = matrix[0].length;
		int firstRow = 1;
		
		for (int i=0; i<rowLen; i++) {
			for (int j=0; j<colLen; j++) {
				if (matrix[i][j] == 0) {
					matrix[0][j] = 0;
					
					if (i != 0) {
						matrix[i][0] = 0;
					} else {
						firstRow = 0;
					}
				}
			}
		}
		
		for (int i=1; i<rowLen; i++) {
			if (matrix[i][0] == 0) {
				for (int j=1; j<colLen; j++) {
					matrix[i][j] = 0;
				}
			}
		}
		
		for (int j=0; j<colLen; j++) {
			if (matrix[0][j] == 0) {
				for (int i=1; i<rowLen; i++) {
					matrix[i][j] = 0;
				}
			}
		}
		
		if (firstRow == 0) {
			for (int i=0; i<colLen; i++) {
				matrix[0][i] = 0;
			}
		}
	}
}
