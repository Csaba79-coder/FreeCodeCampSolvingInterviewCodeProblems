package tasks;

import java.util.ArrayList;

public class KthPermutation {

    public String getPermutation(int n, int k) {
        // initialize all numbers
        ArrayList<Integer> numberList = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {
            numberList.add(i);
        }
        int fact = 1;   // set factorial of n-1

        for (int i = 1; i <= n-1; i++) {
            fact = fact * i;
        }

        if ((long) k > (long) fact * n) {
            k = (int) ((long) k - (long) (fact * n));
        }
        k--; // set k to base 0

        StringBuilder result = new StringBuilder();
        result = getP(result, numberList, n, k, fact);
        return result.toString();
    }
    public static StringBuilder getP(StringBuilder result,
                                     ArrayList<Integer> numberList, int n, int k, int fact) {
        if (numberList.size() == 1 || n == 1) {
            result.append(numberList.get(0));
            return result;  // return condition
        }
        int number = (k / fact) + 1 ;
        result.append(numberList.get(number - 1));
        numberList.remove(number - 1);
        k = k % fact;  // update k
        fact = fact / (n - 1);
        n--;
        return getP(result, numberList, n, k, fact);
    }
}