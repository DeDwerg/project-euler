package main.java.tothonderd.totDertig;

//The Fibonacci sequence is defined by the recurrence relation:
//
//        Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
//        Hence the first 12 terms will be:
//
//        F1 = 1
//        F2 = 1
//        F3 = 2
//        F4 = 3
//        F5 = 5
//        F6 = 8
//        F7 = 13
//        F8 = 21
//        F9 = 34
//        F10 = 55
//        F11 = 89
//        F12 = 144
//        The 12th term, F12, is the first term to contain three digits.
//
//        What is the index of the first term in the Fibonacci sequence to contain 1000 digits?

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Opdracht25 {

    public static void main(String[] args) {

        List<BigInteger> fibonacci= new ArrayList<>();
        BigInteger numberOne = new BigInteger("1");
        fibonacci.add(numberOne);
        fibonacci.add(numberOne);

        BigInteger nieuwGetal = new BigInteger("0");

        do  {
            System.out.println(nieuwGetal);
            BigInteger laatsteGetal = fibonacci.get(fibonacci.size() - 1);
            BigInteger eenALaatsteGetal = fibonacci.get(fibonacci.size() - 2);
            nieuwGetal = laatsteGetal.add(eenALaatsteGetal);
            fibonacci.add(nieuwGetal);
        } while(String.valueOf(nieuwGetal).length() < 1000);
        
        System.out.println(fibonacci.size());
    }
}
