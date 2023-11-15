package WiproInterviewQuestions;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        //first way
        String[] sentence = {"A", "A", "B", "B", "C"};
        Set<String> remove = new TreeSet<>(Arrays.asList(sentence));
        System.out.println(remove);

        System.out.println("====================");

        //second way

        String word = "AAAABBBCCCCCDDDDEEEEEHHH";
        String[] arr = word.split("");
        Set<String> rem = new TreeSet<>(Arrays.asList(arr));
        System.out.println(rem);

        System.out.println("====================");


        //third way

        String word1 = "AAABBBCCCCCCDDDDDDEEEEHHHHGGKKKLL";
        String result = "";
        for (int i = 0; i < word1.length(); i++) {
            if (!result.contains(word1.substring(i, i + 1))) {
                result += word1.substring(i, i + 1);
            }
            System.out.println(result);
        }
    }
}
