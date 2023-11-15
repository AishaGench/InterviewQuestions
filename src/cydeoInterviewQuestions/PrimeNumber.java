package cydeoInterviewQuestions;

public class PrimeNumber {
    /*
    Create a method that can check if a number is prime or not
        input:2
        output:true
        input:1
        output:false
        input:8
        output:false
    */

        public static void main(String[] args) {

            boolean result = isPrime(1);
            System.out.println(result);

        }

        public static boolean isPrime(int number) {
            if (number < 2)
                return false;

            boolean isPrime = true;

            double boundry = Math.sqrt(number); //this is the best boundry for prime number check

            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            return isPrime;
        }

        public static String isPrime2(int number) {
            if (number < 2)
                return "false";

            String isPrime = "true";


            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    isPrime = "false";
                    break;
                }

            }
            return isPrime;


        }


}
