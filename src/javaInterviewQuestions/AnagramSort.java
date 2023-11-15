package javaInterviewQuestions;

import java.util.Arrays;

public class AnagramSort {
    public boolean isAnagramSort(String str, String str2) {
        if (str.length() != str2.length()) {
            return false;
        }
        char[] word = str.toCharArray();
        char[] word2 = str2.toCharArray();
        Arrays.sort(word);
        Arrays.sort(word2);
        return Arrays.equals(word, word);
    }

    public static void main(String[] args) {
        String str = "heart";
        String str2 = "earth";
        //isAnagramSort(str,str2);
    }



}
