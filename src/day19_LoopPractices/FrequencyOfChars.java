package day19_LoopPractices;

public class FrequencyOfChars {

    public static void main(String[] args) {
        String str = "aabcccdaabbc";

        String result = "";  // a2b3c4...


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                char each = str.charAt(j);

                if (ch == each) {
                    count++;

                }
            }


            if (result.contains("" + ch)) {
                continue;
            }
            result += ch;
            result += count;

        }
        System.out.println(result);

    }
}
