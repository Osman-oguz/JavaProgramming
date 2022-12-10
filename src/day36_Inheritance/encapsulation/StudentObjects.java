package day36_Inheritance.encapsulation;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1= new Student("Osman",36,'M','A',"Cydeo School");

        student1.setAge(39);
        System.out.println(student1.getName());

        System.out.println(student1);
    }
}
