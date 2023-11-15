package javaInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListLoop {

    public static void main (String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(13);
        al.add(7);
        al.add(36);
        al.add(89);
        al.add(97);
        //System.out.println(al);
        Collections.sort(al); //sort al

        // Printing elements one by one with for-loop
        for (int i = 0; i < al.size(); i++) {
            System.out.println( al.get(i));
        }
        System.out.println("=================");

        // Printing elements one by one with for-each
        for(int each : al){System.out.println(each);}

    }
}
