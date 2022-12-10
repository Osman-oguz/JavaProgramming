package day16_ForLoop_String;

public class UniqeCharactersFromString {

    public static void main(String[] args) {
        String str = "aabbdaaecc";
        //            01234567
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
                result += str.charAt(i);

            }

        }
        System.out.println(result);
    }


}
