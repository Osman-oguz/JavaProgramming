package day04_VariablesPrimitiveString;

public class Currencies {

    public static void main(String[] args) {
        // $1000,

        int dollar = 1000;
        double lira = dollar * 18.4;
        double euro = dollar * 1.01;
        double JPY = dollar * 142.556;
        double pound = dollar * 0.86;
        double CAD = dollar * 1.31;

        System.out.println("dollar = " + dollar);
        System.out.println("euro = " + euro);
        System.out.println("lira = " + lira);
        System.out.println("JPY = " + JPY);
        System.out.println("pound = " + pound);
        System.out.println("CAD = " + CAD);

    }
}
