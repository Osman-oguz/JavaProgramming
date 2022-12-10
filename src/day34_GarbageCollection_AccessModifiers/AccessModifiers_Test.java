package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers_Test {

    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
     //   System.out.println(AccessModifiers.privateData); // is not visible


        AccessModifiers.method1();
          AccessModifiers.method2(); //default, it is not visible outside the package
        //   AccessModifiers.method3(); private  it is not visible outside the class
    }
}
