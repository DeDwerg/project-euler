package src.main.java.tothonderd.totHonderd;

//A number chain is created by continuously adding the square of the digits in a number to form a new number until it has been seen before.
//
//        For example,
//
//        44 → 32 → 13 → 10 → 1 → 1
//        85 → 89 → 145 → 42 → 20 → 4 → 16 → 37 → 58 → 89
//
//        Therefore any chain that arrives at 1 or 89 will become stuck in an endless loop. What is most amazing is that EVERY starting number will eventually arrive at 1 or 89.
//
//        How many starting numbers below ten million will arrive at 89?

public class Opdracht92 {

    public static void main(String[] args) {
        int result = 0;

        int counter = 9999999;


        for (int i = counter; i > 0; i--) {

            int currentNumber = i;
            boolean endNumber = false;

            while (!endNumber) {
                int squareRoot = 0;

                int numberLength = String.valueOf(currentNumber).length();
                for (int j = numberLength; j > 0; j--) {

                    String number = String.valueOf(currentNumber).substring(j - 1, j);

                    squareRoot = squareRoot + Integer.valueOf(number) * Integer.valueOf(number);

                }
                if (squareRoot == 1 || squareRoot == 89) {
                    if(squareRoot == 89) {
                        result++;
                    }
                    counter++;
                    endNumber = true;
                }
                currentNumber = squareRoot;
            }
        }
        System.out.println(result);
    }
}
