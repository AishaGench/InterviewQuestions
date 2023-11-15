package targetPrep_2;

import java.util.ArrayList;
import java.util.List;

public class Add_All_Numbers {
    /*
       Write a function that takes in a list of numbers.
       It should return the sum of all the numbers in the list.
     */
    public static int sumOfElements(List<Integer> list){
        int  sum= 0;

        for(int i=0; i<list.size(); i++) {
            sum+=list.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(5);
        a.add(7);
        a.add(4);
        System.out.println(sumOfElements(a));
    }


}
