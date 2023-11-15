package targetPrep_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class More_Evens_Or_Odds {
    /*
       Write a function that takes in a list of numbers.
      If it has more even numbers than odd numbers, return 'even'.
      If it has more odd numbers than even numbers, return 'odd'.
      If there's a tie, return 'even and odd'.
     */
    public static String whichOneIsMore(List<Integer> list){
        String status= "";
        int countEven=0;
        int countOdd=0;
        for(int i=0; i<list.size(); i++) {
            if((list.get(i))%2==0) {  //if it is even
                countEven+=1;  // if it is even, we added one
            }else {// if it is odd
                countOdd+=1;// if it is odd, we added one
            }
        }
        if (countEven > countOdd) {//even number bigger then odd number or not or equal
            status="Even";
        }else if(countOdd > countEven) {
            status="Odd";
        }else {
            status="Even and odd";
        }

        return status;
    }

    public static void main(String[] args) {
        List<Integer> myList= new ArrayList<>(Arrays.asList(1,5,7,4,6,8,10));
        System.out.println(whichOneIsMore(myList));
    }
}
