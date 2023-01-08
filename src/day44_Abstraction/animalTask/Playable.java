package day44_Abstraction.animalTask;

public interface Playable {

    static boolean isFrendly = true;

     static void method1() {
        System.out.println(isFrendly);
    }

    void play();


}
