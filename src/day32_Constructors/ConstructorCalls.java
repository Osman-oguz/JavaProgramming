package day32_Constructors;

public class ConstructorCalls {

    public ConstructorCalls(){
        // this(); can not call itself
         System.out.println("Default Constructor");
    }
    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
        //  this(); we must use at the first step
    }
    public ConstructorCalls(String a){
        // this(); we can use one of them
        this(10);
        System.out.println("Constructor with String argument");

    }

    public static void main(String[] args) {
        ConstructorCalls obj1 = new ConstructorCalls();
        System.out.println("------------------");

        ConstructorCalls obj2 = new ConstructorCalls(10);
        System.out.println("------------------");

        ConstructorCalls obj3 = new ConstructorCalls("10");

    }




}
