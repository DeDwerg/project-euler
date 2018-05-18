package main.java.tothonderd.tottwintig;

import java.math.BigInteger;

/**
 * Created by AL13685 on 18-5-2018.
 */

//The following iterative sequence is defined for the set of positive integers:
//
//        n → n/2 (n is even)
//        n → 3n + 1 (n is odd)
//
//        Using the rule above and starting with 13, we generate the following sequence:
//
//        13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
//        It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
//
//        Which starting number, under one million, produces the longest chain?
//
//        NOTE: Once the chain starts the terms are allowed to go above one million.
public class Opdracht14 {

    public static void main(String[] args) {

        Long latestChainNumber;
        int longestChain = 0;
        Long longestChainCorrespondingNumber = 0L;
        int counter = 1;
        Long numberToTest = 0L;

        while (numberToTest < 1000000) {

            latestChainNumber = numberToTest;

            while (latestChainNumber > 1) {
                if (latestChainNumber % 2 == 0) {
                    latestChainNumber = latestChainNumber / 2;
                } else {
                    latestChainNumber = latestChainNumber * 3 + 1;
                }
                counter++;
            }

            if (counter > longestChain) {
                longestChain = counter;
                longestChainCorrespondingNumber = numberToTest;
            }

            numberToTest ++;
            counter = 1;
        }
        
        System.out.println(longestChainCorrespondingNumber);
    }
}
