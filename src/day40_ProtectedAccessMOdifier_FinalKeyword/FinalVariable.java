package day40_ProtectedAccessMOdifier_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;

    static {
        name = "Batch 25";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        final double pi = 3.14;

      //   pi = 4.14;  final variables con not be reassigned

      final String name;

      name = "Java";
      // name = "Wooden Spoon";

        System.out.println("-------------------");

        FinalVariable obj = new FinalVariable("May/01");
        // obj.birthDay="June/01"; final variables can not be reassigned

    }

}
