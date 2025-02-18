import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median;
        int[] mergeNums = mergeArrays(nums1, nums2);
        if (mergeNums.length == 1) return mergeNums[0];
        Arrays.sort(mergeNums);
        int lenght = mergeNums.length;
        int medium = lenght / 2;
        if (mergeNums.length % 2 == 0) {
            median = (double) (mergeNums[medium - 1] + mergeNums[medium]) / 2;
        } else {
            median = mergeNums[medium];
        }

        return median;
    }

    private int[] mergeArrays(int[] nums1, int[] nums2) {
        int[] mergeNums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergeNums, 0, nums1.length);
        System.arraycopy(nums2, 0, mergeNums, nums1.length, nums2.length);

        return mergeNums;
    }
}
