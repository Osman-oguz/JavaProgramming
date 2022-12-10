package day24_CustomMethod_Return;

public class BreakfastTasks {

    public static void main(String[] args) {
        initials("Osman", "Oğuz"); //
        domain("osman-oguz@hotmail.com");
        nameOfTheMonth(4);
        daysInMonth(5);



    }
    //1.create a method that can display the initials of the person. initials(String firstName, String lastName)
    public static void initials(String firstName, String lastName){

        System.out.println(firstName.toUpperCase().charAt(0)+"."+lastName.toUpperCase().charAt(0));

    }

    //2. Create a method that can display the domain of the email. domain(String)

    public static void domain(String email){
        System.out.println(email.substring(email.indexOf('@')+1,email.lastIndexOf('.')));
    }

    //3. Create a method that can display the name of the month based on the given number to the method

    public static void nameOfTheMonth(int number){
        String name = "";

        if (number >= 1 && number<=12){

            name = (number==1)?"Jan":(number==2)?"Feb":(number==3)?"March":(number==4)?"Apr":(number==5)?"May":(number==6)?"Jun":(number==7)?"Jul":(number==8)?"Aug":(number==9)?"Sep":(number==10)?"Oct":(number==11)?"Nov":"Dec";
        }else {
            name = "Invalid";
        }
        System.out.println(name);

    }

    //4. Create a method that can print how many days a month has

    public static void daysInMonth(int number){

        boolean has28Days = number == 2;
        boolean has30Days = number == 4 || number ==6 || number == 9 || number ==11;
        boolean has31Days = !has28Days && !has30Days;

        if ( has28Days){
            System.out.println("28 days");
        }
        if ( has30Days){
            System.out.println("30 days");
        }
        if ( has31Days){
            System.out.println("31 days");
        }
    }

}
