package cydeoInterviewQuestions.week_04;

public class PerfectSquare {
    /*
    -Amazon Interview Question-
    How to find if a number is a perfect square ,
    and he gave an example of 25 and 36, he said that these two numbers are perfect squares,
    but the problem is how to find if they are perfect squares{1, 4, 9, 25, 36, 49, 64, 81, 100, 121, 144...}
     */

        public static void main(String[] args) {

            boolean result=isPerfectSquare(50);

            System.out.println(result);
            System.out.println("==========");
            System.out.println(isPerfectSquare2(4));

        }

        private static boolean isPerfectSquare(int number) {
            //  System.out.println(Math.ceil(7.1));
            System.out.println(Math.sqrt(number));
            System.out.println(Math.ceil(Math.sqrt(number)));
            // if it is perfect   7.0                      7.0
            return Math.sqrt(number)==Math.ceil(Math.sqrt(number));
        }

        private static boolean isPerfectSquare2(int number){
            if (number<1)
                return false;
            else if (number==1)
                return true;

            boolean isPerfect=false;
            //number=number/2*number/2;  //except 4 we can not find any number with that formula
            //Math.sqrt(number)
            for (int i = 2; i <=number/2 ; i++) {
                if (i*i==number){
                    isPerfect=true;
                    break;
                }

            }

            return isPerfect;
        }

}
