package cydeoInterviewQuestions.week_03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
    /*
    String str="I am from California"
    output ="a in rofi IaCmorfmaI"
     */
        public static void main(String[] args) {
            String str="I am from California";       //it is literal pool and head
            String output= reverseString(str);

            System.out.println(output);
        }

        public static String reverseString(String str){
            String output="";
            String[] words = str.split(" ");
//()-->{}
            List<Integer> lengths = Arrays.stream(words).map(k -> k.length()).collect(Collectors.toList());
        /*
                List<Integer> lengths=new ArrayList<>();

                for (String word : words) {
                    lengths.add(word.length());
                }

         */
            // System.out.println("lengths = " + lengths);

            String nonSpace= str.replaceAll(" ","");
            //  System.out.println("nonSpace = " + nonSpace);

            String reversed = new StringBuilder(nonSpace).reverse().toString();
            // 012345678
            ///ainrofilaCmorfmaI
            //  System.out.println("reversed = " + reversed);
            int start=0;
            for (Integer length : lengths) {

                String substring = reversed.substring(start, length + start);
                start=start+length;
                output+=substring+" ";


            }

            //  IamfromCalifornia
            return output.trim();

        }

}
