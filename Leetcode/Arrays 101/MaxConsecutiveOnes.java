public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] binaryArray = new int[] {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(binaryArray));
    }

    public static int findMaxConsecutiveOnes(int[] binaryArray) {
        int countOnes = 0;
        int maxNumber = 0;
        for (int num : binaryArray) {
            if (num == 1) {
                countOnes++;
                maxNumber = findMax(countOnes, maxNumber);
            } else {
                countOnes = 0;
            }
        }

        return maxNumber;
    }

    private static int findMax(int countOnes, int maxNumber) {
        int checkMaxNumber = (countOnes >= maxNumber) ? countOnes : maxNumber;
        return checkMaxNumber;
    }
}