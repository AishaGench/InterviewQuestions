package javaInterviewQuestions;

import java.util.Arrays;
import java.util.TreeSet;

/*
    1. write a return method that check if a string is build out of
        the same letters as another string
    Ex: same ("aaaabbcc", "cccccab"); -> true, same("abc","abb"); -> false
     */
public class Same_Letters {
    public static void main(String[] args) {
        System.out.println(same("hello","hii"));
        System.out.println(Same("hel","hello"));
        System.out.println(StrEql("hello","hello"));
    }

    public static boolean same(String a, String b){
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1 ="",
                a2 = "";
        for (char each : ch1) {
            if(!a1.contains("" + each))
            a1 += each;
        }
        for (char each : ch2) {
            if(!a2.contains("" + each))
            a2 += each;
        }
        return a1.equals(a2);
    }
    public static boolean StrEql(String str1, String str2){
        while(!str1.isEmpty()){
            str1 = str1.replaceAll(str1.substring(0,1),"");
            str2 = str2.replaceAll(str1.substring(0,1),"");
            if (str2.isEmpty()){
                return true;
            }else {
                return false;
            }
        }
        return str1.equals(str2);
    }
    /*
    Solution 2:
    we create a TreeSet to remove duplicate and sort it at the same time
    and I aply the split method to reach every single character
    and then I convert it to the string
     */
    public static boolean Same(String str1, String str2){
        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
        return str1.equals(str2);
    }
}
