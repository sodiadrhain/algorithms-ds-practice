public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int tmp = 0;
        
        for (int j=0; j<A.length; j++) {
            tmp = A[i];
            if (A[j] % 2 == 0){
                A[i] = A[j];
                A[j] = tmp;
                i++;
            }
        }
        return A;
    }
}
