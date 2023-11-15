package targetPrep_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Longest_Word {
    /*
      Write a function that takes in a list of words.
     It should return the longest word (the one with the greats amount of characters)in the list.
     If there's a tie, return the word that appears earliest.
     For example:['boo', 'a', 'I', 'hi'] => 'boo'
                 ['one', 'two', 'superduper', 'dog'] => 'superduper'
                 ['hello', 'world'] => 'hello'
     */
    public static List<String> longestWords(List<String> words) {
        List<String> list = new ArrayList<String>(); // we create new list
        int longest_length = 0; // we'll check which one longest word in list
        for (String str : words) {
            int length = str.length(); //if length equals which one bigger it'll add in the list
            if (length > longest_length) {
                longest_length = length;
                list.clear(); //if it is small it'll clear
            }
            if (length == longest_length) {
                list.add(str); // it'll add
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<String > words = new ArrayList<String>(Arrays
                .asList("dog","superduper","hello","country","elephants","octopus"));
        System.out.println(longestWords(words));
    }

}
