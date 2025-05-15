package ses2.classes.practise;

import java.util.ArrayList;

public class palinArrList {

    // Write a Java function to accept an ArrayList of Strings
    // and return the number of Palindrome words in the given list.
    // Note: A Palidndrome is a word that when reversed, reads the same word.
    // Ex: "madam", "abba", "racecar" and so on.

    public static int countPalindrome(ArrayList<String> list) {
        int count = 0;

        for (String word : list) {
            if (isPalindrome(word)) {
                count++;
            }
        }

        return count;

    }

    // T E N E T
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("tenet");
        list.add("ndndn");

        int palindromeCount = countPalindrome(list);
        System.out.println(palindromeCount);

    }

}
