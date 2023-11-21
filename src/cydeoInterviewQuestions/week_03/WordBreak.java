package cydeoInterviewQuestions.week_03;

import java.util.List;

public class WordBreak {
    /*
       Word Break Problem
    Given an input string and a dictionary of words, find out if the input string can be segmented into a space-separated sequence of dictionary words. See following examples for more details.
    This is a famous Google interview question, also being asked by many other companies now a days.
    Consider the following dictionary
    { i, like, sam, sung, samsung, mobile, ice, cream, icecream, man, go, mango}
    Input:  ilike
    Output: Yes
    Input:  ilikesamsung
    Output: Yes
     */

        static List<String> dictionary=List.of( "i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man",   "go",  "mango");

        public static void main(String[] args) {
            String input="ilikesam";
            String output=breakInput(input);

            System.out.println(output);

        }

        private static String breakInput(String input) {
            String result="";
            String eachWord ="";

            int start=0;
            for (int i = 0; i <= input.length(); i++) {
                eachWord =  input.substring(start,i);
                //ilikesamsung
                if (dictionary.contains(eachWord)){
                    result+= eachWord +" ";
                    start+= eachWord.length();
                }

            }

            System.out.println(result);

            String s = result.trim().replaceAll(" ", "");

            //  if (s.length()==input.length())
      /*  if (s.equals(input))
            result="YES";
        else
            result="NO";

       */

            return (s.equals(input))?"YES":"NO";
        }

}
