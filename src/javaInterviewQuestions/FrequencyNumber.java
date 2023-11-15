package javaInterviewQuestions;

import java.util.HashMap;

public class FrequencyNumber {
    public static void main(String[] args) {
//        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//        String s = "aasjjikkk";
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            Integer val = map.get(c);
//            if (val != null) {
//                map.put(c, new Integer(val + 1));
//            }
//            else {
//                map.put(c, 1);
//            }
//        }
//        System.out.println(s);
        String str = "Welcome";
        for(int i=0; i<str.length(); i++) {
            if ( str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {

                System.out.println("True");
            }
            System.out.println("False");
            }
        }



}
