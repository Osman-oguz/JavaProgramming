package day42_Exceptions;

public class DisadvantagesOfThrowsKeyword {

    public static void main(String[] args) {
        System.out.println("Hello");

      //  sleep(2.5); // throws

        System.out.println("Hello world");
        System.out.println("--------------------");

        System.out.println("Hello");

        MorningWorkPut.sleep(2.5); // try & catch : we called this method from other class so there is no exception again

        System.out.println("Cydeo");

    }
  // ıf you handle the exception fastly and you will not use the method anywhere else you can use throws
    public static void sleep(double seconds) throws InterruptedException {
        Thread.sleep((long) (seconds * 1000));
    }

}
