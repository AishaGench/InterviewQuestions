package javaInterviewQuestions;

public class Palindrome_String {
    public static void main(String[] args) {
        String pal = "Hello World";
        int a = 0;
        int b = pal.length()-1;
        boolean target = true;

        for (int i =0; a < b; a++, b--){
            if(pal.charAt(a) == pal.charAt(b)){
                target = true;
            }else {
                target = false;
                break;
            }
        }

        if(target){
            System.out.println("This word is a palindrome");
        }else {
            System.out.println("This word is not a palindrome");
        }
    }
}
