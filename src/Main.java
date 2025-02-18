public class Main {
    public static void main(String[] args) {
        int[] nums1, nums2;
        double expected;
        int example = 0;

        OutputSolution outputSolution = new OutputSolution();

        example++;
        nums1 = new int[]{1,3};
        nums2 = new int[]{2};
        expected = 2.00000;
        outputSolution = new OutputSolution(example, expected, nums1, nums2);
        outputSolution.print();

        example++;
        nums1 = new int[]{1,2};
        nums2 = new int[]{3,4};
        expected = 2.50000;
        outputSolution = new OutputSolution(example, expected, nums1, nums2);
        outputSolution.print();

        example++;
        nums1 = new int[]{0,0};
        nums2 = new int[]{0,0};
        expected = 0.00000;
        outputSolution = new OutputSolution(example, expected, nums1, nums2);
        outputSolution.print();


    }
}