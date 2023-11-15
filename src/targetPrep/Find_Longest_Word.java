package targetPrep;

public class Find_Longest_Word {
    public static void main(String[] args) {
        String w = "Today is a beautiful days longestword";
        String[] word = w.split(" ");
        String longestWord = "";
        for (int i = 0; i < word.length ; i++) {
                if(word[i].length() >= longestWord.length()){
                    longestWord = word[i];
                }
        }
        System.out.println(longestWord);




    }
}
