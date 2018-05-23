package main.java.tothonderd.totDertig;

import java.math.BigInteger;

/**
 * Created by AL13685 on 23-5-2018.
 */
//n! means n × (n − 1) × ... × 3 × 2 × 1
//
//        For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
//        and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
//
//        Find the sum of the digits in the number 100!
public class Opdracht20 {

    public static void main(String[] args) {

        BigInteger nFactor = new BigInteger("1");
        int n = 100;

        while (n > 0) {
            nFactor = nFactor.multiply(new BigInteger(String.valueOf(n)));
            n--;
        }
        String amount = String.valueOf(nFactor);

        int index = 0;
        int result = 0;
        while (index < amount.length()) {
            result = result + Integer.valueOf(amount.substring(index, index+1));
            index++;
        }

        System.out.println(result);
    }
}
