package day17_WhileAndDoWhileLoop;

public class Task1FrequencyOfChar {
    public static void main(String[] args) {

        String str = "Java Java";
        int frequency = 0;
        char ch = 'a';

        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);
            if (ch == eachChar){
                frequency++;
            }

        }
        System.out.println(frequency);


    }

}



/*


 */