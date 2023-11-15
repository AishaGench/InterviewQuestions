package cydeoInterviewQuestions;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        //0 1 2 3 4 5
        int [] ar={1,2,3,4,5,6};

        int[] ints = Arrays.copyOfRange(ar, 2, 5);

        System.out.println(Arrays.toString(ints));

    }
    /*
    Can you create a method in order to get subarrays from the original array
     */
}
