package targetPrep_2;

public class Even_Or_Odd {

    public static void main(String[] args) {
//        int n = 27;
//
//        if(n % 2 ==0)
//            System.out.println("Even");
//        else
//            System.out.println("Odd");
        int a = 0;

        int b = 1;

        System.out.println(a + " " + b + " ");

        for(int i = 2; i <=10; i++) {

            int c = a+b;

            a = b;

            b = c;

            System.out.print(c + "    ");}


    }
}
