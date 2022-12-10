package day31_Constructors.ScrumTask;

import day01_JavaIntro.Test;

public class MyScrumTeam {
    public static void main(String[] args) {
        //3 testers objects
        Tester tester1= new Tester("Layan",11,"QA",110000);
        Tester tester2= new Tester("Ali",43,"SDET",142000);
        Tester tester3= new Tester("Alex",44,"SE",135000);
        Tester tester4= new Tester("Lala",23,"SDET",115000);

        Tester[] testers={tester2,tester3,tester4};

        // 5 developers objects
        Developer developer1= new Developer("Olga",22,"Java Developer",125000);
        Developer developer2= new Developer("Aygun",39,"Java Master",125000);
        Developer developer3= new Developer("Tunc",21,"Software Developer",125000);
        Developer developer4= new Developer("Sinem",28,"Senior Developer",125000);
        Developer developer5= new Developer("Osman",38,"Java Developer",135000);

        Developer[] developers = {developer2,developer3,developer4,developer5};


        // 1 scrum team object
        ScrumTeam scrumTeam= new ScrumTeam("Nigara","Huseyin","Neira",14);
        scrumTeam.addTester(tester1);
        scrumTeam.addTesters(testers);

        scrumTeam.addDeveloper(developer1);
        scrumTeam.addDevelopers(developers);
        System.out.println(scrumTeam);

        System.out.println("----------------------");

        for (Tester eachTester :scrumTeam.testersList) {
            System.out.println(eachTester.name+ " : " + eachTester.salary);
        }
        System.out.println("----------------------");

        for (Developer eachDeveloper: scrumTeam.developersList) {
            System.out.println(eachDeveloper.name + " : " + eachDeveloper.salary);
        }
        System.out.println("----------------------");

        scrumTeam.removeTester(23);
        scrumTeam.removeDeveloper(22);
        System.out.println(scrumTeam);




    }
}
