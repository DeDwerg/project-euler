package main.java.tothonderd.tottwintig;

import java.math.BigInteger;

/**
 * Created by AL13685 on 18-5-2018.
 */

//2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
//
//        What is the sum of the digits of the number 2^1000?

public class Opdracht16 {

    public static void main(String[] args) {

        BigInteger factor = new BigInteger("1");
        int factorAmount = 1000;

        for (int i = 1; i <= factorAmount; i++) {
            factor = factor.multiply(new BigInteger("2"));
        }

        int sum = 0;
        String stringifiedFactor = String.valueOf(factor);

        int firstindex = 0;
        int secondindex = 1;

        while (stringifiedFactor.length() >= secondindex) {
            sum = sum + Integer.valueOf(stringifiedFactor.substring(firstindex, secondindex));
            firstindex++;
            secondindex++;
        }

        System.out.println(sum);

    }

}
