package WiproInterviewQuestions;

public class StringReverse {
    public static void main(String[] args) {
        String str = "How are you?";
        String reversed = "";
        for (int i = str.length()-1; i >=0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);

        //2nd way
        StringBuilder str2 = new StringBuilder("Hi everybody");
        System.out.println(str2.reverse());

        //3th way
        StringBuffer word = new StringBuffer("Java is fun!");
        System.out.println(word.reverse());
    }
}
