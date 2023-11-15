package targetPrep;

public class Get_Words_Starting_With_Vowels {
    public static void main(String[] args) {
        /*
        Write a function that takes in a list of words.
        Return a list of words that start with a vowel.
        Vowels are aeiou. You don't have to worry about capital letters
        (although, it makes for a great bonus challenge).
        For example:
        ['elephant', 'hello', 'octopus'] => ['elephant', 'octopus']
        ['hi', 'meow', 'yay'] => []
         */

        //List of vowels
        String vowels[] = {"a", "e", "i", "o"};
        //List of the words
        String[] list = {"elephant", "hello", "octopus", "hi", "orange", "by", "school", "apple"};
        //first loop for list
        for (int i = 0; i < list.length; i++) {
            //second loop for vowels
            for (int j = 0; j < vowels.length; j++) {
                //the first word if it starts with a vowel, it shows to us
                //if it is equal, it will be print
                if (vowels[j].equalsIgnoreCase(list[i].substring(0, 1))) {
                    System.out.print(" " + list[i]);
                }
            }
        }
    }


        }


