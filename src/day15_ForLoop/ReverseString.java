package day15_ForLoop;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Osman";
        String str2="";

    /*    for (int i = 0; i < str.length() ; i++ ){

             str2 +=str.charAt((str.length()-1)-i);

     */
        for (int i =str.length()-1; i >=0  ; i-- ){

            str2 +=str.charAt(i);
        }
        System.out.println( str2);
    }
}
/* 0=>3
   1=>2
   2=>1
   3=>0

 */
