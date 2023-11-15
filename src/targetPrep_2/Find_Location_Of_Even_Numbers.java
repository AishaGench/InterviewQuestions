package targetPrep_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Location_Of_Even_Numbers {
    /*
      Write a function that takes in a list of numbers.
     It should return the indices of the even numbers.
     */
    public static List<Integer> indexOfEvenNum(List<Integer> list){

        List<Integer> returnIndex= new ArrayList<>(); // we create a new list

        for(int i=0; i<list.size(); i++) {
            if((list.get(i))%2==0) {  //it is even or not
                returnIndex.add(i); // if it is even, I'll add to list

            }
        }

        return returnIndex;
    }

    public static void main(String[] args) {
        List<Integer> myList=new ArrayList<>(Arrays.asList(2,1,4,5,6,8,10));
        System.out.println(indexOfEvenNum(myList));
    }

}
