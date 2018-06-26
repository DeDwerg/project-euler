package src.main.java.tothonderd.totVeertig;

//The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.
//
//        Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.
//
//        (Please note that the palindromic number, in either base, may not include leading zeros.)

import java.util.ArrayList;
import java.util.List;

public class Opdracht36 {

    public static void main(String[] args) {
        String number = "1";
        List<Integer> palindromes = new ArrayList<>();

        while (Integer.valueOf(number) < 1000000) {
            boolean palindromeTen = false;
            if(Integer.valueOf(number) < 10) {
                palindromeTen = true;
            }
            int frontIndex = 0;
            int backIndex = number.length() - 1;
            while (number.charAt(frontIndex) == number.charAt(backIndex) && frontIndex < number.length() / 2) {
                if (frontIndex == number.length() / 2 - 1) {
                    palindromeTen = true;
                }
                frontIndex++;
                backIndex--;
            }
            if (palindromeTen) {

                boolean palindromeBin = false;
                if(Integer.valueOf(number) < 2){
                    palindromeBin = true;
                }

                String binary = Integer.toString(Integer.valueOf(number), 2);

                frontIndex = 0;
                backIndex = binary.length() - 1;

                while (binary.charAt(frontIndex) == binary.charAt(backIndex) && frontIndex < binary.length() / 2) {
                    if (frontIndex == binary.length() / 2 - 1) {
                        palindromeBin = true;
                    }
                    frontIndex++;
                    backIndex--;
                }

                if(palindromeBin) {
                    palindromes.add(Integer.valueOf(number));
                }
            }
            number = String.valueOf(Integer.valueOf(number) + 1);
        }

        int result = 0;
        for (int i : palindromes
             ) {
            result = result + i;
        }
        System.out.println(result);

    }

}
