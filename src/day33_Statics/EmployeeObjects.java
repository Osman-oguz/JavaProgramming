package day33_Statics;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1= new Employee();
        employee1.name= "Ahmet";
        Employee employee2= new Employee();
        employee2.name= "Aygun";

        Employee employee3= new Employee();
        employee3.name= "Bekir";

        System.out.println("employee3 = " + employee3.name);
        System.out.println("employee2 = " + employee2.name);
        System.out.println("employee1 = " + employee1.name);
    }

}
