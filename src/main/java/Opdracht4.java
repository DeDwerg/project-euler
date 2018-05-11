package main.java;

/**
 * Created by AL13685 on 9-5-2018.
 */

//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//        Find the largest palindrome made from the product of two 3-digit numbers.
public class Opdracht4 {

    private static int numberA = 999;

    public static void main(String[] args) {

        int numberB = 999;
        int result = 0;

        while(numberB >= 499) {
            int foundNumber = findPalindrome(numberB);
            if (foundNumber > result) {
                result = foundNumber;
            }
            numberA = 999;
            numberB = numberB - 1;
        }
        System.out.println(result);
    }

    private static int findPalindrome(int numberB) {
        boolean palindromeFound = false;
        int result = 0;
        while (!palindromeFound) {
            result = numberA * numberB;
            palindromeFound = testIsPalindrome(result);
            numberA = numberA - 1;
        }
        return result;
    }

    private static boolean testIsPalindrome(int number) {
        String numberToTest = String.valueOf(number);
        return numberToTest.equals(new StringBuilder(numberToTest).reverse().toString());
    }
}
