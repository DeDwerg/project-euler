package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AL13685 on 9-5-2018.
 */

// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?
public class Opdracht3 {

    public static void main(String[] args) {

        Long numberToTest = 600851475143L;
        Long divider = 2L;

        while (numberToTest != 1) {
            if (numberToTest % divider != 0) {
                divider++;
            } else {
                numberToTest = numberToTest / divider;
            }
        }
        System.out.println(divider);
    }
}
