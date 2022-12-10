package day10_NestedIf;

public class Task_2_CrewAndPassangers {
    public static void main(String[] args) {
        /*
        Create a class called CrewAndPassangers, Given a number of people on the ship (int number),
        determine how many need to be crew members and how many can be passengers. Print how many
         of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */
        int number = 50;
        int crew = 0;
        int passengers = 0;
        String text = "Invalid Number";

        if (number == 50 || number == 75 || number == 100) {
            if (number == 50) {
                crew = 20;
                passengers = 30;
                text = crew + " Crew, " + passengers + " Passengers";
            } else if (number == 75) {
                crew = 25;
                passengers = 50;
                text = crew + " Crew, " + passengers + " Passengers";
            } else {
                crew = 30;
                passengers = 70;
                text = crew + " Crew, " + passengers + " Passengers";

            }
        } else {
            text = "Invalid Number";

        }
        System.out.println(text);
    }
}