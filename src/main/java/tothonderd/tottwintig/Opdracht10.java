package main.java.tothonderd.tottwintig;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AL13685 on 11-5-2018.
 */

//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//        Find the sum of all the primes below two million.
public class Opdracht10 {

    public static void main(String[] args) {
        List<Integer> primeNumbers = new ArrayList<>();
        primeNumbers.add(2);

        int potentialPrimeNumber = 3;

        while (primeNumbers.get(primeNumbers.size()-1) < 2000000) {
            boolean isPrime = true;
            for (int primeNumber : primeNumbers) {
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

        Long sumPrimes = 0L;
        for(int number: primeNumbers) {
            sumPrimes = sumPrimes + number;
        }

        sumPrimes = sumPrimes - primeNumbers.get(primeNumbers.size()-1);
        System.out.println(sumPrimes);
    }
}
