import java.util.Arrays;

public class SquaresOfASortedArraySolution {
    public static void main(String[] args) {
        int[] nums = new int[] {-4,-1,0,3,10};
        System.out.println(sortedSquares(nums));
    }

    private static int[] sortedSquares(int[] nums) {
        int[] resultArray = new int[nums.length];

        for (int i=0; i<nums.length; i++) {
            nums[i] *= nums[i];
            resultArray[i] = nums[i];
        }

        Arrays.sort(resultArray);
        
        return resultArray;
    }
}
