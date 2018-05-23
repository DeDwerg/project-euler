package main.java.tothonderd.tottwintig;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AL13685 on 23-5-2018.
 */
//
//If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
//
//        If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
//
//
//        NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
public class Opdracht17 {

    private static Map <Integer, String> map;

    public static void main(String[] args) {
        mapNumbers();
        int currentNumber = 1;
        String allNumbers = "";
        while(currentNumber <= 1000) {
            int tempNumber = currentNumber;

            if (tempNumber / 1000 > 0 && tempNumber > 0) {
                allNumbers = allNumbers + map.get(currentNumber / 1000);
                allNumbers = allNumbers + map.get(1000);
                tempNumber = tempNumber - 1000;
            }
            while (tempNumber / 100 > 0 && tempNumber > 0) {
                String number = tempNumber / 100 + "00";
                allNumbers = allNumbers + map.get(currentNumber / 100);
                allNumbers = allNumbers + map.get(100);
                tempNumber = tempNumber - Integer.valueOf(number);
            }

            if (currentNumber % 100 != 0 && currentNumber > 100) {
                allNumbers = allNumbers + "and";
            }

            if (tempNumber / 10 > 1 && tempNumber > 0) {
                String decimal = tempNumber / 10 + "0";
                allNumbers = allNumbers + map.get(Integer.valueOf(decimal));
                tempNumber = tempNumber - Integer.valueOf(decimal);
            }

            for (int i = 19; i >= tempNumber && 1 > 0; i--) {
                if (tempNumber > 0 && tempNumber / i > 0) {
                    allNumbers = allNumbers + map.get(i);
                    tempNumber = tempNumber - i;
                }
            }
            currentNumber++;
        }

        System.out.println(allNumbers.length());
    }

    private static void mapNumbers() {
        map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        map.put(13, "thirteen");
        map.put(14, "fourteen");
        map.put(15, "fifteen");
        map.put(16, "sixteen");
        map.put(17, "seventeen");
        map.put(18, "eighteen");
        map.put(19, "nineteen");
        map.put(20, "twenty");
        map.put(30, "thirty");
        map.put(40, "forty");
        map.put(50, "fifty");
        map.put(60, "sixty");
        map.put(70, "seventy");
        map.put(80, "eighty");
        map.put(90, "ninety");
        map.put(100, "hundred");
        map.put(1000, "thousand");
    }
}
