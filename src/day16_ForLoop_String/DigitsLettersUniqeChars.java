package day16_ForLoop_String;


import java.util.Scanner;

public class DigitsLettersUniqeChars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String letters = "";
        String digits = "";
        String specialChars = "";


        System.out.println("Enter a string:");
        String str = input.nextLine();


        for (int i = 0; i < str.length(); i++) {
            char    ch = str.charAt(i);

            if ( (ch >='a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z' )){
                letters += str.charAt(i);
            }else if( ch >= '0' && ch <='9') {
                digits += str.charAt(i);
            }else {
                specialChars += str.charAt(i);
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("special Chars = " + specialChars);
    }


}
