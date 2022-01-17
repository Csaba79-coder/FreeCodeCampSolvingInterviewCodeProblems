package tasks;

import java.util.Arrays;

public class KthLargestElement {

    public int KLargest(int[] array, int num) {
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            return array[num-1];
        }
        return num;
    }

    public int KSmallest(int[] array, int num) {
        Arrays.sort(array);
        return array[num-1];
    }
}
