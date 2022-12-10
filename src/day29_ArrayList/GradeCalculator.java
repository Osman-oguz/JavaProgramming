package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {

    public static void main(String[] args) {

        ArrayList<Integer> scores= new ArrayList<>();

        scores.addAll(Arrays.asList(100,90,75,85,65,85,55,45,73,73,35,47));

        ArrayList<Integer> gradeofA=new ArrayList<>(scores); // 90-100
        gradeofA.removeIf(p -> !(p >=90 && p<= 100));
        System.out.println("gradeofA = " + gradeofA);

        ArrayList<Integer> gradeofB=new ArrayList<>(scores); // 80-90
        gradeofB.removeIf(p -> !(p >=80 && p< 90));
        System.out.println("gradeofB = " + gradeofB);

        ArrayList<Integer> gradeofC=new ArrayList<>(scores); // 70-80
        gradeofC.removeIf(p -> !(p >=70 && p< 80));
        System.out.println("gradeofC = " + gradeofC);

        ArrayList<Integer> gradeofD=new ArrayList<>(scores); // 60-70
        gradeofD.removeIf(p -> !(p >=60 && p< 70));
        System.out.println("gradeofD = " + gradeofD);

        ArrayList<Integer> gradeOfF= new ArrayList<>(scores);
        gradeOfF.removeAll(gradeofA);
        gradeOfF.removeAll(gradeofB);
        gradeOfF.removeAll(gradeofC);
        gradeOfF.removeAll(gradeofD);
        System.out.println("gradeOfF = " + gradeOfF);

        System.out.println("Total number of A = " + gradeofA.size());
        System.out.println("Total number of B = " + gradeofB.size());
        System.out.println("Total number of C = " + gradeofC.size());
        System.out.println("Total number of D = " + gradeofD.size());
        System.out.println("Total number of F = " + gradeOfF.size());




    }
}
