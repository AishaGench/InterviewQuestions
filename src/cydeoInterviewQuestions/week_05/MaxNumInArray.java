package cydeoInterviewQuestions.week_05;

import java.util.Arrays;

public class MaxNumInArray {
    /*
       Write a function that can find the maximum number from an int Array
     */

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        int maxNumber = findMax1(array);
        System.out.println("maxNumber = " + maxNumber);

        int maxNumber2 = findMax2(array);
        System.out.println("maxNumber2 = " + maxNumber2);

    }
    //first way
    private static int findMax1(int[] array){

        Arrays.sort(array); // It will sort array in asc order
        return  array[array.length - 1];

    }
    // second way
    private static int findMax2(int[] array){

        int max=array[0];

        for (int eachNumber : array) {
            if(eachNumber>max)
                max=eachNumber;
        }
        return max;
    }


}
