package targetPrep;

public class More_Evens_Or_Odds {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,7,8,9,10,11,12,14,15};
        int countEven = 0;
        int countOdd = 0;

        for(int a : num){
            if(a % 2 ==0){
                countEven += 1;
            }else{
                countOdd +=  1;
            }
        }
        if (countEven > countOdd){
            System.out.println("Even");
        }else if(countOdd > countEven){
            System.out.println("Odd");
        }else {
            System.out.println("Even and Odd");
        }




    }
}
