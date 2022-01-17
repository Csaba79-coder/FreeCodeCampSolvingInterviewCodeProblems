package tasks;

import java.util.ArrayList;
import java.util.List;

public class FirstLastPositionInSortedArray {

    public void findFirstAndLast(int[] arr, int x)
    {
        int n = arr.length;
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (x != arr[i])
                continue;
            if (first == -1)
                first = i;
            last = i;
        }
        if (first != -1) {
            System.out.println("First Occurrence = " + first);
            System.out.println("Last Occurrence = " + last);
        }
        else
            System.out.println("Not Found");
    }

    public List<Integer> findFirstAndLastIndex(int[] arr, int target) {
        int start;
        int end;
        List<Integer> firstLastIndex = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                start = i;
                firstLastIndex.add(start);
            }

            while (i + 1 < arr.length && arr[i +1] == target) {
                end = i;
                firstLastIndex.add(end);
            }
        }
        return firstLastIndex;
    }

    public void printFirstAndLastFromList(List<Integer> list) {
        System.out.println("First Occurrence = " + list.get(0));
        System.out.println("Last Occurrence = " + list.get(1));
    }
}
