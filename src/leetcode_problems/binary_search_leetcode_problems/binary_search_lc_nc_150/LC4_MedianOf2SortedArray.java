package leetcode_problems.binary_search_leetcode_problems.binary_search_lc_nc_150;

public class LC4_MedianOf2SortedArray {
    public double findMedianSortedArraysInEfficient(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[nums1.length + nums2.length];
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < m || j < n) {
        	if (i < m && j < n && nums1[i] <= nums2[j]) {
        		while (i < m && nums1[i] <= nums2[j]) {
        			arr[k] = nums1[i];
        			i++;
        			k++;
        		}
        	} else {
        		while (j < n && nums2[j] <= nums1[i]) {
        			arr[k] = nums2[j];
        			j++;
        			k++;
        		}
        	}
        }
        
        int len = arr.length;
        
        if (len % 2 !=0) {
        	return (double)arr[len/2];
        } else {
        	return ((double)arr[len/2] + (double)arr[len/2-1])/2;
        }
    }
}
