package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex","Husky",'M',3,"Small","White");
        System.out.println(dog1);
        dog1.bark();

        Cat cat1= new Cat("Love","Siamese",'F',2,"Large","Black");
        System.out.println(cat1);

    }
}
