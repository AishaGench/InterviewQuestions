package targetPrep;

import java.util.Scanner;

public class Add_All_Numbers {
    public static void main(String[] args) {
        int [] arr = {2, 4, 5,6};
        int sum = 0;
        for(int num : arr){
            sum = sum + num;
        }
        System.out.println("Sum of array is : " + sum);

 //second way
        int num1 = 5;
        int num2 = 8;
        int sum2 = num1 + num2;
        System.out.println("Sum2 is this number: " +sum2);


    //third way
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[4];
        int sum3 = 0;
        System.out.println("Enter the elements:");
        for (int i=0; i<4; i++)
        {
            array[i] = scanner.nextInt();
        }
        for( int num : array) {
            sum3 = sum3+num;
        }
        System.out.println("Sum of array elements is:"+sum3);
    }
}
