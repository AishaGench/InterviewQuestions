package javaInterviewQuestions;

public class Degistirme {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        // how would you swap a and b?
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a= " + a);
        System.out.println("b= " + b);

        // how would you swap without temp variable?
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a= " + a);
        System.out.println("b= " + b);

        int nums[]= {1,2,3,4,5};
        for(int e:nums) {
            if (e % 2 != 0) {
                System.out.println(e +"= Odd number");
            }else if(e % 2 == 0){
                System.out.println(e + "= Even number");
            }
        }




    }
}
