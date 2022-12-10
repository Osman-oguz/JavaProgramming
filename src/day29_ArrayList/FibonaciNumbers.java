package day29_ArrayList;

import java.util.ArrayList;

public class FibonaciNumbers {
    public static void main(String[] args) {
        System.out.println(fibonaci(99));
    }
    public static ArrayList<Integer> fibonaci(int numbersToShow){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 0);
        list.add(1, 1);

        for (int i = 2; i < numbersToShow+2; i++) {
            list.add(i, list.get(i-1)+list.get(i-2));
        }
        return list;
    }
}