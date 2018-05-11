package main.java;

/**
 * Created by AL13685 on 9-5-2018.
 */

// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
public class Opdracht5 {

    public static void main(String[] args) {
        int number = 20;
        boolean numberFound = false;
        while (!numberFound) {
            for (int i = 20; i >= 1; i--) {
                if (number % i != 0) {
                    break;
                } else {
                    System.out.println("in else " + number);
                    if (i == 1) {
                        System.out.println(number);
                        numberFound = true;
                    }
                }
            }
            number++;
        }
    }
}
