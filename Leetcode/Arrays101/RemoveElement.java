public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int numsVal = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[numsVal] = nums[i];
                numsVal++;
            } 
        }
        return numsVal;
    }
}
