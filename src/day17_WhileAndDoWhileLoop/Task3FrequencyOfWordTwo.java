package day17_WhileAndDoWhileLoop;

public class Task3FrequencyOfWordTwo {

    public static void main(String[] args) {


        String str = "caT dog dogG cAt";

        int frequency1 = 0;
        int frequency2 = 0;

        for (int i = 0; i <= str.length()-3; i++) {
            String word =  str.substring(i,i+3);

            if (word.equalsIgnoreCase("cat") ){
                frequency1++;
            }
            if (word.equalsIgnoreCase("dog") ){
                frequency2++;
            }

        }
        System.out.println(frequency1 == frequency2);

    }

}
/*

write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true



 */