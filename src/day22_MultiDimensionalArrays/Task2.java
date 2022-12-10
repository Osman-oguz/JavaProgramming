package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        String[][] items2D = {{"Apple", "Banana", "Grape", "Avocado"}, {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"}, {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

      /*  for (String[] each1D : items2D) {
            for (String each : each1D) {
                System.out.print(each + "\t");
            }
            System.out.println();
        }

       */

      /*  String result = "";
        for (int i = 0; i < items2D.length; i++) {

            for (int i1 = items2D[i].length - 1; i1 >= 0; i1--) {
                System.out.print(items2D[i][i1] + "  ");
            }
            System.out.println();
        }

       */
        String result = "";
        for (int i = items2D.length-1; i >= 0; i--) {
            for (int i1 = 0; i1 < items2D[i].length; i1++) {
                System.out.print(items2D[i][i1] + "  ");
            }
            System.out.println();
        }



    }
}
/*

2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
 */