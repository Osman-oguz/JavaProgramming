package day15_ForLoop;

public class forLoopPractices {

    public static void main(String[] args) {

        for (int i = 15; i <= 45 ; i++ ){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------");

        for (int i = 100; i>=50; i-- ){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-------------------");

        for (int i = 2; i<= 55; i+=2 ){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("---------------------");

        for (char i = 'A'; i<= 'Z'; i++){
            System.out.print(""+i + " ");
        }

        System.out.println();
        System.out.println("-------------------------");

        for (char i = 0; i<= 40010; i++){
            System.out.print(i + " ");

        }
        // 3.21
    }
}
