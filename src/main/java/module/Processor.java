package module;

import tasks.*;

public class Processor {

    public void run() {

        System.out.println("----------------1st task------------------");
        System.out.println("Anagram: ");

        Anagram anagram = new Anagram();

        String s1 = "danger";
        String s2 = "garden";

        String s3 = "me";
        String s4 = "he";

        anagram.printIfAnagram(anagram.isAnagram(s1, s2));
        anagram.printIfAnagram(anagram.isAnagram(s3, s4));

        System.out.println("----------------2st task------------------");
        System.out.println("First & last index in sorted array: ");

        FirstLastPositionInSortedArray find = new FirstLastPositionInSortedArray();

        int[] arr1 = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int x = 8;

        int[] arr2 = {1, 3, 5, 5, 5, 5, 7, 123, 125};
        int z = 7;

        find.findFirstAndLast(arr1, x);
        find.findFirstAndLast(arr2, z);

        System.out.println("----------------3rd task------------------");
        System.out.println("Kth largest element: ");

        int[] arrK1 = {7, 10, 4, 3, 20, 15};
        int k1 = 3;

        int[] arrK2= {7, 10, 4, 3, 20, 15};
        int k2= 4;

        System.out.println(new KthLargestElement().KLargest(arrK1, k1));
        System.out.println(new KthLargestElement().KLargest(arrK2, k2));

        System.out.println("Smallest element:");

        System.out.println(new KthLargestElement().KSmallest(arrK1, k1));
        System.out.println(new KthLargestElement().KSmallest(arrK2, k2));

        System.out.println("----------------4th task------------------");
        System.out.println("Symmetric Tree:");

        int[] symmetricTree = {1, 2, 2, 3, 4, 4, 3}; // symmetric
        // int[] unsymmetricalTree = {1,2,2,null,3,null,3}; // unsymmetrical
        int[] unsymmetricalTree = {1, 2, 4, 3, 2, 1}; // unsymmetrical

        SymmetricTree.printResult();

        System.out.println("----------------5th task------------------");
        System.out.println("Generate parenthesis: ");

        System.out.println(new GenerateParentheses().generateParenthesisFirstSolution(3));
        System.out.println(new GenerateParentheses().generateParenthesisSecondSolution(2));

        System.out.println("----------------6th task------------------");
        System.out.println("Gas station: ");

        int[] gas = {1, 5, 3, 3, 5, 3, 1, 3, 4, 5};
        int[] cost = {5, 2, 2, 8, 2, 4, 2, 5, 1, 2};

        System.out.println(new GasStation().findStartingPointOfGasStation(gas, cost));

        System.out.println("----------------7th task------------------");
        System.out.println("Course schedule: ");

        int course = 6;
        int[][] prerequisites = new int[2][2];
        prerequisites[0][0] = 0;
        prerequisites[0][1] = 1;
        prerequisites[1][0] = 3;
        prerequisites[1][1] = 0;

        System.out.println(new CourseSchedule().canFinish(course, prerequisites));

        System.out.println("----------------8th task------------------");
        System.out.println("Kth permutation: ");

        int permutationN = 3;
        int permutationK = 4;

        System.out.println(new KthPermutation().getPermutation(permutationN, permutationK));

        System.out.println("----------------9th task------------------");
        System.out.println("Minimum window substring: ");

        String s = "ADOBECODEBANC";
        String t = "ABC";

        // output: "BANC"

        System.out.println(new MinimumWindowSubstring().checkMinWindow(s, t));

        System.out.println("---------------10th task------------------");
        System.out.println("Largest rectangle in histogram: ");

        int[] rectanglesData = new int[] {2,1,5,6,2,3};
        System.out.println(new LargestRectangleInHistogram().calculateLargestRectangleArea(rectanglesData));
    }
}
