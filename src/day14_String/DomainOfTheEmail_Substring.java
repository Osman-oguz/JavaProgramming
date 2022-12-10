package day14_String;

public class DomainOfTheEmail_Substring {

    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";

        int beginningIndex = email.indexOf("@") + 1;
        int endingIndex = email.lastIndexOf(".");

       String domain = email.substring(beginningIndex,endingIndex);

        System.out.println("domain = " + domain);

        System.out.println("---------------------");

        String str1 = "Java is fun, Java is cool, I love Java";

        // Java is fun
        String s1 = str1.substring(0,10+1);
        System.out.println("s1 = " + s1);

        // Java is cool

        int beg = str1.indexOf(" J") + 1;
        int end = str1.lastIndexOf(",");

        String s2 = str1.substring(beg,end);
        System.out.println("s2 = " + s2);

        String s3 = str1.substring(str1.lastIndexOf(",")+2);
        System.out.println("s3 = " + s3);


    }
}
