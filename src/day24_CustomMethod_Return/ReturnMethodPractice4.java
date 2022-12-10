package day24_CustomMethod_Return;

public class ReturnMethodPractice4 {

    public static void main(String[] args) {

        // create a method that can duplicated chars from a string and returns  the new value


        String str = "ccccccccfffffffffgggggt";
         str =removeDuplicated(str);
        System.out.println(str);
    }

    public static String removeDuplicated(String str){ // aaabbbcc ===> abc

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains(""+each)){
                result += each;
            }
        }
        return result;

    }
}
