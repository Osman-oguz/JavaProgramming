package day23_CustomMethods_Void;

public class CustomMethodPractice {
    public static void main(String[] args) {
        helloWorld5Times("Hello guys.");
        helloCydeo5Times();


    }

    //create a function that print hello world 5 times

    public static void helloWorld5Times(String sentence ){
        for (int i = 0; i < 5; i++) {
            System.out.println(sentence);
        }

    }

    //create a function that print hello Cydeo 5 times
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }


}
