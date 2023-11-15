package javaInterviewQuestions;

public class Palindrome_Integer {
    public static void main(String[] args) {
        palindrome(3454);
        System.out.println(palindromeInt(3443));
    }
    public static void palindrome(int num){
        int temp = num;
        int reverse = 0;
        while (temp >0){
            reverse *= 10;
            reverse += temp % 10;
            temp /= 10;
        }
        if(reverse == num){
            System.out.println("This number is a palindrome");
        } else {
            System.out.println("This number is not a palindrome");
        }

        //second way
        int i = 3456,
                reversed = 0;

        while(i != 0) {
            reversed = reversed * 10;
            reversed = reversed + i % 10;
            i = i / 10;
        }

        System.out.println("Reversed Number: " + reversed);



    }
    public static boolean palindromeInt(int num){
        String str = Integer.toString(num);
        String reversed = "";
        for (int i = str.length()-1; i >=0; i--) {
            reversed += str.charAt(i);
        }
        return str.equalsIgnoreCase(reversed);
    }

}
