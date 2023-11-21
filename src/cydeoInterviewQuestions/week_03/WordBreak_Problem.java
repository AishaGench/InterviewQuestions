package cydeoInterviewQuestions.week_03;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class WordBreak_Problem {

    /*
    Word Break Problem
Given an input string and a dictionary of words, find out if the input string can be segmented into a space-separated sequence of dictionary words. See following examples for more details.
This is a famous Google interview question, also being asked by many other companies now a days.
Consider the following dictionary
{ i, like, sam, sung, samsung, mobile, ice, cream, icecream, man, go, mango}
Input:  ilikeicecream
Output:
option1 = [i, like, ice, cream]
option2 = [i, like, icecream]
Input:  ilikeicecreammango
Output:
option1 = [i, like, ice, cream, man, go]
option2 = [i, like, icecream, mango]
     */
    static List<String> dictionary = List.of("i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go" , "mango");

    public static void main(String[] args) {

        String input = "ilikeicecreammango";
        wordBreak(input);


    }

    private static void   wordBreak(String input) {

        Set<String> wordsSet=new LinkedHashSet<>();

        for (String each : dictionary) {

            if (input.contains(each)){
                wordsSet.add(each);
            }
        }

        List<String> words=new LinkedList<>(wordsSet);
        List<String> option1=new LinkedList<>(words);
        List<String> option2=new LinkedList<>(words);
        System.out.println("words = " + words);
        for (int i = 0; i < words.size()-2; i++) {

            String current = words.get(i);
            String next = words.get(i+1);
            String following = words.get(i+2);

            if ((current+next).equals(following)){
                option1.remove(following);
                option2.remove(current);
                option2.remove(next);
            }

        }

        System.out.println("option1 = " + option1);
        System.out.println("option2 = " + option2);



    }
}