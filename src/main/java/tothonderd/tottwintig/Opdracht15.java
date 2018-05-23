package main.java.tothonderd.tottwintig;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AL13685 on 20-5-2018.
 */

//Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
//
//
//        How many such routes are there through a 20×20 grid?
public class Opdracht15 {

    public static void main(String[] args) {

        int gridSize = 20;
        List<Long> values = new ArrayList<>();
        values.add(1L);
        values.add(1L);

        while(values.size() <= gridSize) {

            if (values.size() % 2 == 0) {

                List<Long> temp = new ArrayList<>();
                temp.add(values.get(values.size() / 2) + values.get(values.size() / 2 - 1));
                int counter = 1;

                while (counter < values.size() / 2) {
                    temp.add(values.get(values.size() / 2 + counter - 1) + values.get(values.size() / 2 + counter));
                    temp.add(0, values.get(values.size() / 2 - 1 - counter + 1) + values.get(values.size() / 2 - 1 - counter));
                    counter++;
                }

                temp.add(1L);
                temp.add(0, 1L);

                values = temp;

            } else {
                List<Long> temp = new ArrayList<>();
                int counter = 1;

                while (counter <= (values.size() - 1) / 2) {

                    temp.add(values.get((values.size() - 1) / 2 + counter - 1) + values.get((values.size() - 1) / 2 + counter));
                    temp.add(0, values.get((values.size() - 1) / 2 - counter + 1) + values.get((values.size() - 1) / 2 - counter));
                    counter++;
                }

                temp.add(1L);
                temp.add(0, 1L);

                values = temp;
            }
        }

        while(values.size() > 1) {

            if (values.size() % 2 == 0) {

                List<Long> temp = new ArrayList<>();
                temp.add(values.get(values.size() / 2) + values.get(values.size() / 2 - 1));
                int counter = 1;

                while (counter < values.size() / 2) {
                    temp.add(values.get(values.size() / 2 + counter - 1) + values.get(values.size() / 2 + counter));
                    temp.add(0, values.get(values.size() / 2 - 1 - counter + 1) + values.get(values.size() / 2 - 1 - counter));
                    counter++;
                }

                values = temp;

            } else {
                List<Long> temp = new ArrayList<>();
                int counter = 1;

                while (counter <= (values.size() - 1) / 2) {

                    temp.add(values.get((values.size() - 1) / 2 + counter - 1) + values.get((values.size() - 1) / 2 + counter));
                    temp.add(0, values.get((values.size() - 1) / 2 - counter + 1) + values.get((values.size() - 1) / 2 - counter));
                    counter++;
                }

                values = temp;
            }
        }
        System.out.println("resultaat");
        for (Long i : values) {
            System.out.println(i);
        }
    }
}
