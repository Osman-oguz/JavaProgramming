package day19_LoopPractices;

public class FindTheUniqueChars {
    public static void main(String[] args) {


        String str = "aaabcdddee";
        String result = "";   //bdf


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) { // compares the character that outer loop picked, with each character

                char each = str.charAt(i);

                if (ch == each) {
                    count++;
                }

            }
            if (count == 1){ // if the frequency of the character is 1, the character is unuique
                result += ch;
            }

        }
        System.out.println(result);



    }


}
