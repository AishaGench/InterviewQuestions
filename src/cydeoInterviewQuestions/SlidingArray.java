package cydeoInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingArray {
    /*
    Median of sliding window in an array
    Given an array of integer arr[] and an integer k, the task is to find the median of each window of size k starting from
    the left and moving towards the right by one position each time.
    Examples:
    Input: arr[] = {-1, 5, 13, 8, 2, 3, 3, 1}, k = 3
    Output: 5 8 8 3 3 3
    Input: arr[] = {-1, 5, 13, 8, 2, 3, 3, 1}, k = 4
    Output: 6.5 6.5 5.5 3.0 2.5

     -1, 5, 13
    -1, 5, 13 == > median=5

    -1, 5, 13, 8
    -1 5 8 13 median=(5+8)/2 =6.5
     */

        public static void main(String[] args) {

            int arr[] = {-1, 5, 13, 8, 2, 3, 3, 1}, k = 3;

            int arr2[] = {-1, 5, 13, 8, 2, 3, 3, 1}, l = 4;
        /*
        0-3
        1-4
         */
            List<Double> medians= separeteWindowWithSize(arr,k);
            List<Double> medians2= separeteWindowWithSize(arr2,l);

            System.out.println(medians);
            System.out.println("===========================");
            System.out.println(medians2);

        }

        private static List<Double> separeteWindowWithSize(int[] arr, int k) {

            //  0  1  2
            //[-1, 5, 13]
            List<Double> result=new ArrayList<>();

            for (int i = 0; i <= arr.length-k; i++) {

                int [] subArr=   Arrays.copyOfRange(arr,i,i+k);
                Arrays.sort(subArr);
                System.out.println(Arrays.toString(subArr));

                if (k%2!=0){
                    result.add( (double) subArr[k/2]);
                }else {

                    // -1 5 8 13 median=(5+8)/2 =6.5
                    result.add((double)(subArr[k/2] +subArr[k/2-1])/2);
                }

            }

            return result;
        }

}
