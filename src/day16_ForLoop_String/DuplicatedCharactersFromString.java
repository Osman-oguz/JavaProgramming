package day16_ForLoop_String;

public class DuplicatedCharactersFromString {

    public static void main(String[] args) {

        String str = "aabbaacc";
        //            01234567
        String result = "";

        for (int i = 0; i < str.length()-1; i++) {
            String  ch ="" + str.charAt(i);
            if (!result.contains(ch)){
                result += ch;

            }

        }
        System.out.println(result);
    }
}
