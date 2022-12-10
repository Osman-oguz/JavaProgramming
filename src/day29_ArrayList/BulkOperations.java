package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,6));
        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8));
        System.out.println(list);

        System.out.println("----------------------------");

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,800,900));
        numbers.retainAll(Arrays.asList(100,300,500));
        System.out.println(numbers);

        System.out.println("-------------------------------");


        ArrayList<String> jobTitles=new ArrayList<>();

        jobTitles.addAll(Arrays.asList("QA","SDET","Developer","QA","SDET","Scrum Master"));
        jobTitles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(jobTitles);

        System.out.println("---------------------------");

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));
        boolean r1 = nums.contains(10);
        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);
        boolean r3 = nums.containsAll(Arrays.asList(2,5,100));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("------------------------");

        // if the array non-primitive we can apply

        String [] names = {"Josh", "Jack","Daniel","Shay","Breanna"};
        ArrayList<String> namesList= new ArrayList<>(Arrays.asList(names));

        System.out.println(namesList);

        /*
        ArrayList<String> namesList= new ArrayList<>();
        namesList.addAll(Arrays.asList(names));
        System.out.println(namesList);

         */

        System.out.println("-------------------------------");

        Integer [] arr = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);

        System.out.println("-------------------------------");

        int [] arr2 = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list3= new ArrayList<>(convertArrayToArrayList(arr2));

        System.out.println(list3);



    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array){

        ArrayList<Integer> list = new ArrayList<>();
        for (Integer each : array) {
            list.add(each);
        }
        return list;
    }
}
/*
Bulk Operations: argument MUST be a collection type

	addAll(CollectionType): adds collection of values to the arrayList
	removeAll(CollectionType): removes all the matching elements from the arraylist
	retainAll(CollectionType): removes all the non-matching elements from the arraylist
	containsAll(CollectionType): checks if all the elements are contained in the arraylist
 */