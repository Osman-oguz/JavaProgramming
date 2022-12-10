package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123";
       int num= Integer.parseInt(str); // int

        System.out.println(num+1); // 124
        System.out.println(str+1); // 1231

        String str2="10.5";

       double num2= Double.parseDouble(str2);

        System.out.println(num2+1);

        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        long max2=Long.MAX_VALUE;
        long min2=Long.MIN_VALUE;

        System.out.println("min2 = " + min2);
        System.out.println("max2 = " + max2);

        String s1="true";
        String sen2="maybe";
        boolean b1=Boolean.parseBoolean(s1);
        boolean b2=Boolean.parseBoolean(sen2);

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        System.out.println("----------------------------");
        String s2= "123";
        Integer x= Integer.valueOf(s2);  // integer
        int y= Integer.valueOf(s2);  //integer

        System.out.println(x);
        System.out.println(y);

        System.out.println("-----------------------------");
        char ch1='A';
        //isDigit()
        boolean r2=Character.isDigit(ch1);

        //isLetter()
        boolean r3=Character.isLetter(ch1);


        // Special Char
        boolean r4=!Character.isLetterOrDigit(ch1);

        // uppercase
        boolean r5=Character.isUpperCase(ch1);

        // lowercase
        boolean r6= Character.isLowerCase(ch1);


        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("---------------------------");

        String s= "asd234dfff45";
        int sum=0;

        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);


        // perse methods: converting strings to the primitives, returns primitive
     // valueOf methods: converting strings to the wrapper class objects, returns wrapper class object

        String str5="45";
        int a = Integer.parseInt(str5);
     System.out.println(a+10);

     String str6="21.5";
     double b= Double.parseDouble(str6);
     System.out.println(b+3);

     double c=Double.valueOf(str6);
     System.out.println(c+56);





    }
}
