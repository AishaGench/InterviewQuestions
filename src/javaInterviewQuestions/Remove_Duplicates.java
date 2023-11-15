package javaInterviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Remove_Duplicates {
    public static void main(String[] args) {
        System.out.println(removeDup("Hello world"));
        System.out.println(removeDupHash("hello world"));
        
    }
    //write a return method that can remove the duplicate values from String
    //Ex: removeDup("AAABBBCCC") ==>ABC
    public static String removeDup(String str){
        String result = "";
        for (int i = 0; i <str.length() ; i++) {
            if(!result.contains("" + str.charAt(i))){
                result += "" + str.charAt(i);
            }
        }
        return result;
    }
    /*
    First, I declare an empty String.
    Then I run a for loop. The loop runs from 1 th index of the original
    String until the last (str.length -1)index. In my if condition inside the loop,
    I compare if each character of the original String is contained in the empty String.
    if that character is not contained, I concat it to the empty String.
    When the loop finishes, all non-duplicate characters are added to the empty String.
    My method returns the String that I declared before the loop.
     */
    public static String removeDupHash(String str){
        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str = str.replace(",","").replace("[","").replace("]","");
        return str;

    }
    /*
    linkedHashSet remove duplicate and keep the order as is after split I' m having each character
     and then convert it to string then since it's giving me as a list with bracket and I need to remove
     */




}
