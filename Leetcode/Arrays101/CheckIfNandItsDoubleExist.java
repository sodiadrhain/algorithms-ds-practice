public class CheckIfNandItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        for (int j=0; j<arr.length; j++) { 
            int i = 0;
            while (i<arr.length) {
                if (arr[i] == 2*arr[j] && i!=j) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}
