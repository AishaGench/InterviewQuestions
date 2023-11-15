package WiproInterviewQuestions;

public class PalindromeForString {
    public static void main(String[] args) {
        String word = "Hello Word";
        int a =0;
        int b = word.length()-1;
        boolean target = true;

        for (int i =0; a < b; a++,b--) {
            if(word.charAt(a) == word.charAt(b)){
                target = true;
            }else {
                target = false;
                break;
            }
        }
        System.out.println(word);

        if(target){
            System.out.println("It is Palindrome");
        }else{
            System.out.println("It is not Palindrome");
        }

    }

}
