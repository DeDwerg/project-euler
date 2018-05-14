package main.java.tien;

/**
 * Created by AL13685 on 9-5-2018.
 */

//The sum of the squares of the first ten natural numbers is,
//1² + 2² + ... + 10² = 385
//The square of the sum of the first ten natural numbers is,
//(1 + 2 + ... + 10)² = 55² = 3025
//Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
public class Opdracht6 {

    public static void main(String[] args) {
        int squareSum = 0;
        for (int i = 1; i <= 100; i++) {
            squareSum = squareSum + (i*i);
        }
        System.out.println(squareSum);

        int sumSquares = 0;
        for (int i = 0; i <= 100; i++) {
            sumSquares = sumSquares + i;
        }

        sumSquares = sumSquares * sumSquares;
        System.out.println(sumSquares);

        System.out.println(sumSquares - squareSum);

    }
}
