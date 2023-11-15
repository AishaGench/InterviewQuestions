package WiproInterviewQuestions;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 0; i <=10 ; i++) {
            System.out.print(sum + " ");
            sum = a + b;
            b = a;
            a= sum;
        }
        System.out.println();

        //2nd WAY WHILE LOOP
      /*
        int count=0;
        int a=0;
        int b=1;
        int num=0;
        while(count<=10) {
            System.out.print(num+"  ");
            num=a+b;
            b=a;
            a=num;
            count++;
        }
        System.out.println();

       */

    }
}
