package WiproInterviewQuestions;

public class PalindromeForNumber {
    public static void main(String[] args) {
        palindrome(6789);
        System.out.println(palindromeInt(98987));
    }
    public static void palindrome(int num){
        int temp = num;
        int reverse = 0;

        while (temp > 0){
            reverse *=10;
            reverse +=  temp % 10;
            temp /= 10;
        }
        if(reverse == num){
            System.out.println("This number is a palindrome");
        }else{
            System.out.println("This number is not a palindrome");
        }
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
