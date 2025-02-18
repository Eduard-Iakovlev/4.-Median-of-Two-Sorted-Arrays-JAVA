import java.util.Arrays;

public class OutputSolution {
    private int example;
    private double expected, result;
    private int[] nums1, nums2;

    OutputSolution() {}

    OutputSolution(int example, double expected, int[] nums1, int[] nums2) {
        this.example = example;
        this.expected = expected;
        this.nums1 = nums1;
        this.nums2 = nums2;
    }

    private void run() {
        Solution solution = new Solution();
        result = solution.findMedianSortedArrays(nums1, nums2);
    }

    void print() {
        System.out.println("============ Тест " + example + " ============");
        System.out.println("Входные данные: \n" + " nums1 = " + Arrays.toString(nums1) + "\n nums2 = " + Arrays.toString(nums2));
        System.out.println("Ожидаемый результат: " + expected);
        run();
        System.out.println("Результат: " + result);
        System.out.println("============ Проверка ============");
        CheckResult checkResult = new CheckResult();
        if(checkResult.check(result, expected)) {
            System.out.println("Тест пройден");
        }else {
            System.out.println("Тест не пройден");
        }
        System.out.println("============================\n");
    }
}