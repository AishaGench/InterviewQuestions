package targetPrep_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Get_Words_Starting_With_Vowels {
    /*
     Write a function that takes in a list of words.
     Return a list of words that start with a vowel.
     Vowels are aeiou. You don't have to worry about capital letters(although,
     it makes for a great bonus challenge).
     For example:
       ['elephant', 'hello', 'octopus'] => ['elephant', 'octopus']
       ['hi', 'meow', 'yay'] => []
     */
    public static List<String> startsWithVowels(List<String> words) {
        List<String> list = new ArrayList<String>(); //create new list
        for (int i = 0; i < words.size(); i++) {
            String element=words.get(i).toLowerCase(); //it change tolower case
            char ch=element.charAt(0);

            if(ch=='a' || ch=='e' ||ch== 'i' ||ch== 'o' || ch=='u') {
                list.add(element); // if it is start a vowel, it'll add in the list
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<String > words = new ArrayList<String>(Arrays
                .asList("dog","superduper","hello","country","elephants","octopus"));
        System.out.println(startsWithVowels(words));
    }

}
