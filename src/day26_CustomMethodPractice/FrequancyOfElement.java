package day26_CustomMethodPractice;

public class FrequancyOfElement {

    public static void main(String[] args) {

        int [] arr = {1,2,3,1,1,2,3,4,5,6,1,2,4};
        int n = frequencyOfElement(arr,1);
        System.out.println(n);


    }
    // returns the freauncy of the given element from the given array
    public static int frequencyOfElement(int [] array,int element){
        int count = 0;
        for (int each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }

    // returns the freauncy of the given element from the given array
    public static int frequencyOfElement(double [] array,double element){
        int count = 0;
        for (double each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }
    // returns the freauncy of the given element from the given array
    public static int frequencyOfElement(char [] array,char element){
        int count = 0;
        for (char each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }
    // returns the freauncy of the given element from the given array
    public static int frequencyOfElement(String [] array,String element){
        int count = 0;
        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }
        return count;
    }
}
