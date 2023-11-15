package javaInterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

interface StringOp <T,E>{
    T function(E e);
}
public class Interface {
    public static void main(String[] args) {
        String string ="AAAB  BCC  DDEE F ";
        System.out.println(removeDup.function(string));
        System.out.println(unique.function(string));
        System.out.println(frequency.function(string));
        System.out.println(reverse.function(string));



    }
    public static StringOp <String,String> removeDup =str->{
        return Arrays.stream(str.split(""))
                .distinct()
                .reduce("",(x,y)-> x+y);
                //.collect(Collectors.joining()); //reduce("",(x,y)->x+y);
    };
    public static StringOp<String, String> unique = str ->{
        String []strArr= str.replaceAll("\\s+","").trim().split("");
        Map<String, Integer> mapping = new HashMap<>();

        for (String st: strArr){
            if(!mapping.containsKey(st)){
                mapping.put(st,1);
            }else{
                mapping.put(st,mapping.get(st) +1);
            }
        }
        System.out.println(mapping);
        return mapping.entrySet().stream()
                .filter(x -> x.getValue()== 1)
                .map(x ->x.getKey())
                .collect(Collectors.joining());
    };
    public static StringOp<String, String> frequency = str ->{
        String []strArr= str.replaceAll("\\s+","").trim().split("");
        Map<String, Integer> mapping = new HashMap<>();

        for (String st: strArr){
            if(!mapping.containsKey(st)){
                mapping.put(st,1);
            }else{
                mapping.put(st,mapping.get(st) +1);
            }
        }
        return mapping.entrySet().stream()
                .map(x ->x.getKey()+x.getValue())
                .collect(Collectors.joining());
    };

    public static StringOp<String, String> reverse =str ->{
        return Arrays.stream(str.split(""))
                .reduce("",(a,b) -> b+a);
    };

    public static StringOp<String, String> reverse1 =str ->{
        return Arrays.stream(str.replaceAll("\\s+","").split(""))
                .reduce("",(a,b) -> b+a);
    };









}
