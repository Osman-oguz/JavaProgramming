package day37_Inheritance.scrumTask;

import java.util.Arrays;

public class AmazonInc {

    public static void main(String[] args) {
        String company = "Amazon Inc";
        ProductOwner po = new ProductOwner("Suhaib",39,'M',1,160000,company);
        BusinessAnalyst ba= new BusinessAnalyst("Cihad",30,'M',2,150000,company);
        ScrumMaster sm = new ScrumMaster("Anel",26,'F',3,145000,company);

        Tester tester1= new Tester("Chian",32,'F',"QA",1415,125000,company);
        Tester tester2= new Tester("Yasaman",31,'F',"QE",1416,130000,company);
        Tester tester3= new Tester("Irena",32,'F',"SDET",1417,125000,company);
        Tester tester4= new Tester("Ali",33,'M',"QA",1418,125000,company);
        Tester[] testers = {tester1,tester2,tester3,tester4};

        Developer developer1= new Developer("Daniella",27,'F',"Java Junior Developer",8,135000,company);
        Developer developer2= new Developer("Osman",29,'M',"Java Developer",9,135000,company);
        Developer developer3= new Developer("John",30,'M',"Java Full Stack",10,135000,company);
        Developer developer4= new Developer("Deniz",28,'F',"Java Developer",11,135000,company);
        Developer developer5= new Developer("Tekin",27,'M',"Java Developer",12,135000,company);
        Developer [] developers = {developer1,developer2,developer3,developer4,developer5};

        ScrumTeam scrumTeam = new ScrumTeam(po,ba,sm);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);
        System.out.println(scrumTeam);
        scrumTeam.addDevelopers(developers);

        System.out.println("--------------------");

        for (Tester each : scrumTeam.testers) {
            System.out.println(each.name + " " + each.salary);
        }





    }
}
