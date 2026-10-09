package leetcode_problems.bit_manipulation_problems.bit_manipulation_lc_nc_150;

/**
 * XOR and bitwise AND left shifted by 1 for carry(<<1)
 * TC - O(1) - O(32) as the carry keeps shifting towards left, 
 *             and the atmost time it runs is 32 time, num. of bits in java (explanation is 'LeetCode problems explanation' docs)
 * SC - O(1)
 */
public class LC371_SumOfIntegers {
	public int getSum(int a, int b) {
       while (b != 0) {
            int temp = a ^ b;
            b = (a & b) << 1;
            a = temp;
       }

       return a;
	}
}
