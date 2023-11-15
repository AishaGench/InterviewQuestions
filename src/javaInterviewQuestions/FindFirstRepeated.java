package javaInterviewQuestions;

public class FindFirstRepeated {
    public static void main(String[] args) {

        String str = "Hello World!";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(str.charAt(i));
                break;
            }


        }


    }

}
