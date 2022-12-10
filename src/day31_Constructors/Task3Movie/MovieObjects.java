package day31_Constructors.Task3Movie;

import java.util.Arrays;

public class MovieObjects {

    public static void main(String[] args) {

        Movie movie1=new Movie("USA","Journey to SDET","Advanture, Comedy, Thriller","10/25/2022","Kuzzat Altay");

        movie1.addCast("Asiya");
        String [] cast= {"Adam","Muhtar","Osman"};
        movie1.addCasts(cast);
        System.out.println(movie1);
    }
}
