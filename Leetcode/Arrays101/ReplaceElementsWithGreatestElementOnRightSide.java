/**
 * ReplaceElementsWithGreatestElementOnRightSide
 */
public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        int count = 0;
        int max = 0;
        while (count < arr.length && count != arr.length-1 ) {
            for (int i=arr.length-1; i>count; i--) {
                max = Math.max(max, arr[i]);
            }
            arr[count] = max;
            count++;
            max = 0;
        }
        
        arr[arr.length-1] = -1;
        
        return arr;
    } 
}