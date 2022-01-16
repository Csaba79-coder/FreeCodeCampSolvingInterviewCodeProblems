package tasks;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        // danger - garden --> they are anagrams, the same chars in word, different order! that is anagram!

        String s1 = "danger";
        String s2 = "garden";

        String s3 = "me";
        String s4 = "he";

        printIfAnagram(isAnagram(s1, s2));
        printIfAnagram(isAnagram(s3, s4));
    }

    private static boolean isAnagram(String s1, String s2) {
        boolean status;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        return status;
    }

    private static void printIfAnagram(boolean bool) {
        System.out.println(bool ? "The Strings are anagrams!" : "The Strings are not anagrams!");
    }
}
