package cydeoInterviewQuestions.week_06;

import java.util.Arrays;

public class FirstFiveLargestNumbersInArray {
    /*
    Amazon
    Given an array of integers , print first 5 largest numbers
     int[] array = {1, 2, 3, 4, 5, 6, 7};

     7,6,5,4,3
     */
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,20,15};

//        String str = print_five_largest(array);
//        System.out.println(str);

        String str1 = print_five_largest2(array);
        System.out.println(str1);
    }

    private static String print_five_largest(int[] array) {
        Arrays.sort(array);
//        String result = array[array.length-1] + "-"
//                + array[array.length-2] + "-"
//                + array[array.length-3] + "-"
//                + array[array.length-4] + "-"
//                +array[array.length-5];
        String result = "";
        for (int i = array.length - 1; i >= array.length - 5; i--) {
            result += array[i] + " ";
        }

        return result;
    }

    private static String print_five_largest2(int[] array) {

        if (array.length<5){
            throw  new RuntimeException("You can not use");
        }
        String str = "";

        for (int k = 1; k <= 5; k++) {
            int max = array[0];
            int indexOfMax = 0;
            for (int i = 0; i < array.length; i++) {
                int temp = array[i];

                if (temp > max) {
                    max = temp;
                    indexOfMax = i;
                }

            }

            str += max + " ";
            array[indexOfMax] = Integer.MIN_VALUE;

        }


        return str;
    }
}
