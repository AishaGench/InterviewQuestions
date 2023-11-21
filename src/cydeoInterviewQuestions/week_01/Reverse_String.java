package cydeoInterviewQuestions.week_01;

public class Reverse_String {
    /*
    Create a method to reverse a string
    input: Adam
    output: madA
    */

    public static String reverseMethod(String str) {
            //I need to get last char
            //I need to get before last char
            //in order to get the char from string we need to use charAt
            //last char index is str.length()-1
            String result="";
            for (int i=str.length()-1;i>=0;i--){
                result+= str.charAt(i);
            }

            return result;
    }

    public static String reverseMethod1(String str) {
        StringBuilder stringBuilder=new StringBuilder(str);
        return stringBuilder.reverse().toString();

    }

    public static void main(String[] args) {
        String str="Aisha";
        String output=reverseMethod(str);
        System.out.println(output);

        String output1=reverseMethod1(str);
        System.out.println(output1);

      /*  String res="adam";
        //   i  j
        System.out.println(res.substring(0, 1)); //a
        System.out.println(res.substring(0, 2));//ad
        System.out.println(res.substring(0, 3));//ada
        System.out.println(res.substring(0, 4));//adam
        System.out.println(res.substring(1, 2));//d
        System.out.println(res.substring(1, 3));//da
        System.out.println(res.substring(1, 4));//dam
        System.out.println(res.substring(2, 3));//a
        System.out.println(res.substring(2, 4));//am
        System.out.println(res.substring(3, 4));//m
       */

    }






}
