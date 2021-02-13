public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int numsVal = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[numsVal]) {
                numsVal++;
                nums[numsVal] = nums[i];
            } 
        }
        return numsVal + 1;
    }
}
