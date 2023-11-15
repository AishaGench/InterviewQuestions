package javaInterviewQuestions;

public class Palindrome_String_2 {
    public static void main(String[] args) {
        String word = " Level";
        String reversed = " ";

        for(int i = word.length() -1; i >=0; i--){
            reversed += word.charAt(i);
        }
        System.out.println(reversed);

        if(word.equalsIgnoreCase(word)){
            System.out.println("It is Palindrome");
        }else{
            System.out.println("It is not Palindrome");
        }


    }
}
