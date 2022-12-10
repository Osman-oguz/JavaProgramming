package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        oddOrEven(24);
        ageOfThePerson(1984);
        printNumbers(3,34);



    }


    // create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){

        if (number % 2 == 0){
            System.out.println(number + " is an even number.");
        }else {
            System.out.println(number + " is an odd number.");
        }
    }

    // create a function that can display the age of the person

    public static void ageOfThePerson(int birthYear){
        int age = 2022-birthYear;
        System.out.println("Your age is: "+age);

    }
    public static void printNumbers(int x,int y){

        for (int i = x; i <=y ; i++) {
            System.out.print(i+" ");
        }
    }


}
