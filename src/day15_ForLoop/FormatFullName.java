package day15_ForLoop;

public class FormatFullName {

    public static void main(String[] args) {

        String firstName = "cyDEo",
                lastName = "SCHOOL";

        String resultFirstName = firstName.substring(0, 1).toUpperCase() +
                firstName.substring(1).toLowerCase();


        String resultLastName = lastName.substring(0, 1).toUpperCase() +
                lastName.substring(1).toLowerCase();


        System.out.println(resultFirstName);
        System.out.println(resultLastName);
    }
}
