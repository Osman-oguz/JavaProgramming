package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Osman";
        String lastName = "Oğuz";
        int age = 38;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100_000.58;


        String fullName = firstName + " " + lastName;

    // Full name pf the person is ___________

        System.out.println("Full name of the person is " + fullName);

        // _____ is ______ years old.,

        System.out.println(fullName + " is " + age + " years old.");

        // Fullname is Jobtitle, works at companyname.

        System.out.println(fullName + " is " + jobTitle + ", works at " +
                companyName + ", and " + fullName + "'s salary is $"
                + salary);
    }
}
