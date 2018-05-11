package main.java;

/**
 * Created by AL13685 on 9-5-2018.
 */

//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//        a² + b² = c²
//        For example, 3² + 4² = 9 + 16 = 25 = 5².
//
//        There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//        Find the product abc. ( is dat: a*b*c ??????)

public class Opdracht9 {

    public static void main(String[] args) {

        int targetNumber = 1000;
        boolean oplossingGevonden = false;

        while (!oplossingGevonden) {
            for (int i = 1; i <= targetNumber; i++) {
                for (int j = 1; j <= targetNumber; j++) {
                    for (int k = 1; k <= targetNumber; k++) {
                        if (i * i + j * j == k * k) {
                            if (i + j + k == targetNumber) {
                                System.out.println(i);
                                System.out.println(j);
                                System.out.println(k);
                                System.out.println(i*j*k);
                                oplossingGevonden = true;
                            }
                        }
                    }
                }
            }
        }
    }
}
