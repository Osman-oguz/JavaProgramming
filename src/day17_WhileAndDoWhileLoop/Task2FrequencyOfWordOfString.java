package day17_WhileAndDoWhileLoop;

public class Task2FrequencyOfWordOfString {

    public static void main(String[] args) {

        String str = " Java Java aaa Java Java Java";

        int frequency = 0;
        for (int i = 0; i <= str.length()-4; i++) {
           String word =  str.substring(i,i+4);

           if (word.equals("Java") ){
               frequency++;
           }

        }
        System.out.println(frequency);

    }
}


/*
write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

 */