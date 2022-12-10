package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifers_Test2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
      //  System.out.println(AccessModifiers.defaultData); // default, it is not visible outside the package
      //  System.out.println(AccessModifiers.privateData); //private  it is not visible outside the class


        AccessModifiers.method1();
      //  AccessModifiers.method2(); default, it is not visible outside the package
     //   AccessModifiers.method3(); private  it is not visible outside the class

    }
}
