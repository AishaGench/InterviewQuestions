package cydeoInterviewQuestions.week_05;
import java.util.Arrays;

public class MinNumInArray {
    /*
        Write a function that can find the minimum number from an int Array
     */
    public static void main(String[] args) {
        int[] array = {6, 4, 3, 6, 1};

        /*
        int minNumber = findMin1(array);
        System.out.println("minNumber = " + minNumber);
         */

        int minNumber2 = findMin2(array);
        System.out.println("minNumber2 = " + minNumber2);

        // MAC --> OPT + ENTER --> Introduce Local Variable + ENTER
        // WIN --> ALT + ENTER --> Introduce Local Variable + ENTER

    }
    private static int findMin1(int[] array){

        Arrays.sort(array); // ASC ORDER
        return  array[0];
    }

    private static int findMin2(int[] array){

        int min=array[0];

        for (int eachNumber : array) {
            if(eachNumber<min)
                min=eachNumber;
        }

        return min;

        // int[] array = {6, 4, 3, 6, 1};
    }
}
