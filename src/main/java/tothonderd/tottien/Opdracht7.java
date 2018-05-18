package main.java.tothonderd.tottien;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AL13685 on 9-5-2018.
 */

//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//        What is the 10 001st prime number?
public class Opdracht7 {

    public static void main(String[] args) {
        List<Long> primeNumbers = new ArrayList<>();
        primeNumbers.add(2L);

        Long potentialPrimeNumber = 3L;

        while (primeNumbers.size() != 10001) {
            boolean isPrime = true;
            for (Long primeNumber : primeNumbers) {
                if (potentialPrimeNumber % primeNumber == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                primeNumbers.add(potentialPrimeNumber);
            }

            potentialPrimeNumber ++;
        }
        System.out.println(primeNumbers.get(10000));
    }
}
