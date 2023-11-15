package WiproInterviewQuestions;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong2(153));
    }

    public static boolean isArmstrong(int num){

        String number = String.valueOf(num);
        int power = number.length();
        int sum = 0;

        for (int i = 0; i <number.length() ; i++) {
            int digit = Integer.parseInt("" + number.charAt(i));
            sum += Math.pow(digit,power);
        }
        return sum == num;
    }
    public static boolean isArmstrong2(int num){
        int digits = num;
        int sum = 0;
        int power = String.valueOf(num).length();
        //153
        //num % 10 --> last digit

        while (digits != 0){

            int each = digits % 10;
            digits /= 10;
            sum += Math.pow(each,power);
        }
        return sum == num;
    }
}
