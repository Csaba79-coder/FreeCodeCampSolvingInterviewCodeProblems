package tasks;

import java.util.Arrays;

public class Anagram {

    // danger - garden --> they are anagrams, the same chars in word, different order! that is anagram!

    public boolean isAnagram(String s1, String s2) {
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

    public void printIfAnagram(boolean bool) {
        System.out.println(bool ? "The Strings are anagrams!" : "The Strings are not anagrams!");
    }
}
