package javaInterviewQuestions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*
 Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDDDEF") ==> "DEF";
 */
public class FindUnique {
    public static void main(String[] args) {
        System.out.println(unique("AAAVVVDDDSSFRE"));
        System.out.println(Unique("AAAVVVDDDSSFRE"));
    }
    //Solution 1
    public static String unique(String str){
        String uni1 ="";
        for (int i = 0; i <str.length() ; i++) {
            int count = 0;
            for (int j = 0; j <str.length() ; j++) {
                if(("" + str.charAt(i)).equals("" + str.charAt(j))){
                    count ++;
                }
            }
            if (count ==1){
                uni1 += str.charAt(i);
            }
        }
        return uni1;
    }
    //Solution 2:
    public static String Unique(String str){
        String result = "";
        for (String each : str.split("")) {
            result += ((Collections.frequency(Arrays.asList(str.split("")),each)) ==1)? each : "";
        }
        return result;
    }

}
