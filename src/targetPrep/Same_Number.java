package targetPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Same_Number {
    /*
        Write a function that takes in a list of number.
        It should return a number that represents the sum of any number in the given list
        that's followed by the same number.
        For example:
        [2,3,4,4,3,5,5] => 9
        [4,4,4,5] => 8
        [1,5,3] => 0

     */
    public static int sumOfElements(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size()-1 ; i++) {
            int currentNum = list.get(i);
            int nextNum = list.get(i + 1);
            if(currentNum == nextNum){
                sum += list.get(i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer>myList = new ArrayList<>(Arrays.asList(2,3,4,4,3,5,5));
        System.out.println(sumOfElements(myList));
    }

}
