package utilities;

import day40_ProtectedAccessMOdifier_FinalKeyword.ProtectedAccessModifier;

public class AccessModifier_Test4 extends ProtectedAccessModifier {
    public static void main(String[] args) {

        // System.out.println(AccessModifier_Test4.name1); // default is not visible outside the package
        System.out.println(AccessModifier_Test4.name2); // protected is visible outside package in subclass ONLY

       //  AccessModifier_Test4.methods1(); // default method is not visible outside the package
        AccessModifier_Test4.methods2();

    }
}
