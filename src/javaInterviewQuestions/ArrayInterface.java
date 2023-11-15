package javaInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

interface ArrayOp<T,E>{
    T function(E e);
}
public class ArrayInterface {
    public static void main(String[] args) {
         int[] intArr = {6,7,89,0,100};
         String[] strArr = {"Ahmet","Mehmet","Seyfo", "Mustafa","Ali"};
         System.out.println(change.function(strArr));
         System.out.println(max.function(intArr));
         System.out.println(secMax(intArr));
         System.out.println(min.function(intArr));
         System.out.println(secMin(intArr));
         System.out.println(ascending.function(intArr) );
         System.out.println(descending.function(intArr));
         System.out.println(setAscending.function(intArr));
    }
    public static ArrayOp<List<String>,String[]> change = str->{
        return Arrays.stream(str)
                .map(x->"" + x.charAt(1) + x.charAt(0) + x.substring(2,x.length()))
                .collect(Collectors.toList());
    };

    public static ArrayOp<Integer,int[]> max =intarr ->{
        return Arrays.stream(intarr)
                .max()
                .getAsInt();
    };

    public static int secMax(int[] arr){
        return Arrays.stream(arr)
                .boxed()
                .sorted((x,y)->y.compareTo(x))
                .collect(Collectors.toList())
                .get(1);
    };

    public static ArrayOp<Integer,int[]> min = intarr ->{
        return Arrays.stream(intarr)
                .min()
                .getAsInt();
    };

    public static int secMin(int[] arr){
        return Arrays.stream(arr)
                .boxed()
                .sorted((x,y)->x.compareTo(y))
                .collect(Collectors.toList())
                .get(1);
    };


    public static ArrayOp<List<Integer>,int[]> ascending = intarr ->{
        return Arrays.stream(intarr)
                .boxed()
                .sorted()
                .collect(Collectors.toList());
    };
    public static ArrayOp<List<Integer>,int[]> descending = intarr ->{
        return Arrays.stream(intarr)
                .boxed()
                .sorted((x,y)->y.compareTo(x))
                .collect(Collectors.toList());
    };
    public static ArrayOp<Set<Integer>,int[]> setAscending = intarr ->{
        return Arrays.stream(intarr)
                .boxed()
                .sorted()
                .collect(Collectors.toSet());
    };

    public static StringOp<String,String> reverse = str ->{
        return Arrays.stream(str.split(""))
                .reduce("",(a,b) -> b + a);

    };


}
