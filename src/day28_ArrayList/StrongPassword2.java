package day28_ArrayList;

public class StrongPassword2 {

    public static void main(String[] args) {

        String password="cLdeo1990@";
        int countUpperCase=0;
        int countLowerCase=0;
        int countDigits=0;
        int countSpecialChar=0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)){
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            } else if (Character.isDigit(each)) {
                countDigits++;
            }else {
                countSpecialChar++;
            }

        }

        boolean hasLowerCase = countLowerCase > 0;
        boolean hasUpperCase = countUpperCase > 0;
        boolean hasDigit= countDigits > 0;
        boolean hasSpecialChar = countSpecialChar > 0;

        boolean strongPassword= password.length() >7 && !password.contains(" ") && hasLowerCase && hasUpperCase && hasDigit && hasSpecialChar;
        System.out.println("strongPassword = " + strongPassword);


    }
}
