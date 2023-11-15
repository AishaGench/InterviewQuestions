package javaInterviewQuestions;

import java.util.Arrays;

public class FindClosedTwoNumbers {
    //From a given array of natural numbers, return the distance between the two closest numbers.

        // Returns the distance between the two closest numbers.
        static int distClosestNumbers(int[] numbers) {
            //try implementing from here
            Arrays.sort(numbers);

            return 0;
        }
        public static void main(String[] args) {
            int[] testArray = {3, 9, 50, 15, 99, 7, 98, 65};
            int result = distClosestNumbers(testArray);
            System.out.println(result); // Expected result is 1 (the 2 closest numbers are 98 and 99)

        }

}
