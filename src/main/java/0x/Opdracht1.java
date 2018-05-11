package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AL13685 on 9-5-2018.
 */
public class Opdracht1 {
    public static void main(String[] args) {
//        If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//        Find the sum of all the multiples of 3 or 5 below 1000.
        List<Integer> devidedby3 = new ArrayList<>();
        List<Integer> devidedby5 = new ArrayList();
        List<Integer> devidedby15 = new ArrayList();
        int sum = 0;
        for(int i = 1; i <1000; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    devidedby15.add(i);
                } else {
                    devidedby3.add(i);
                }
            } else if (i % 5 == 0) {
                devidedby5.add(i);
            }
        }
        for(Integer number : devidedby3) {
            sum = sum + number;
        }
        for(Integer number : devidedby5) {
            System.out.println(number);
            sum = sum + number;
        }
        for(Integer number : devidedby15) {
            System.out.println(number);
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
