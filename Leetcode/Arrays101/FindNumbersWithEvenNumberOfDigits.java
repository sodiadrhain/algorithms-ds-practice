public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = new int[] {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int sumEven =0;
        for (int num : nums) {
            int count = divideTen(num);
            if (count%2 == 0) {
                sumEven++;
            }
        }
        return sumEven;
    }

    private static int divideTen(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
