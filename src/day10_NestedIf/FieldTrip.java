package day10_NestedIf;

public class FieldTrip {

    public static void main(String[] args) {

        int grade = 2;
        String location = "";
        int groupNumber = 0;
        String teacher = "";

        if(grade >= 1 && grade <= 6){
            if (grade ==1){
               location = "Apple orchad";
               groupNumber = 3;
               teacher = "Ms. Smith";
            } else if (grade ==2) {
                location = "Zoo";
                groupNumber = 7;
                teacher = "Mr. Lee";
            }else if (grade ==3) {
                location = "Aquarium";
                groupNumber = 5;
                teacher = "Ms. Wilson";
            }else if (grade ==4) {
                location = "Zoo";
                groupNumber = 7;
                teacher = "Mr. Lee";
            }else if (grade ==5) {
                location = "Zoo";
                groupNumber = 7;
                teacher = "Mr. Lee";
            }else  {
                location = "Zoo";
                groupNumber = 7;
                teacher = "Mr. Lee";
            }
            System.out.println("Location - " + location+ "\nGroup Number - "
                    + groupNumber+"\nTeacher -" + teacher);

        }

    }
}
