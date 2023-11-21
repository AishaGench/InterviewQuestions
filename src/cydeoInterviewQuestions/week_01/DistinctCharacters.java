package cydeoInterviewQuestions.week_01;

import java.util.*;

public class DistinctCharacters {
           /*
        Count of substrings having all distinct characters
        Given a string str consisting of lowercase alphabets, the task is to find the number of possible substrings (not necessarily distinct)
        that consists of distinct characters only.
        Examples:
        Input: Str = “gffg”
        Output: 6
        Explanation:
        All possible substrings from the given string are,
        ( “g“, “gf“, “gff”, “gffg”, “f“, “ff”, “ffg”, “f“, “fg“, “g” )
        Among them, the highlighted ones ( “g“, “gf“, “f“, “f“, “fg“, “g” ) consists of distinct characters only.
        Input: str = “gfg”
        Output: 5
        Explanation:
        All possible substrings from the given string are,
        ( “g“, “gf“, “gfg”, “f“, “fg“, “g” )
        Among them, the highlighted ( “g“, “gf“, “f“, “fg“, “g” ) consists of distinct characters only.
         */
           public static void main(String[] args) {
               String input="gffg";

               int output=countDistinctSubstrings(input);
               System.out.println(output);

           }

           private static int countDistinctSubstrings(String input) {
               List<String> list=new ArrayList<>();

               for (int i = 0; i < input.length(); i++) {

                   for (int j = i+1; j <=input.length() ; j++) {
                       String temp=  input.substring(i, j);
                       boolean isValid=checkWord(temp);
                       if (isValid)
                           list.add(temp);
                   }
               }

               System.out.println(list);


               return list.size();
           }

           private static boolean checkWord(String temp) {
                /*
                gfg 3

                 */
               String[] chars = temp.split("");
               ArrayList<String> list=new ArrayList<>(Arrays.asList(chars));
               Set<String> set=new HashSet<>(list);

               return temp.length()==set.size();
           }
            private static boolean checkWord2(String temp) {
                /*
                gfg 3

                 */

                boolean isValid=true;
                String[] chars = temp.split("");
                ArrayList<String> list=new ArrayList<>(Arrays.asList(chars));

                for (String s : list) {
                    if (Collections.frequency(list,s)>1){
                        isValid=false;
                        break;
                    }
                }

                return isValid;
            }




}
