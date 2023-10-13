package summarySession.friday131023;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("AAA","Aaaa","aAAA","adad","bgfbrft","Bsa");
        for (String s: stringList){
            System.out.println(s);
        }
        System.out.println("--------------------------------------------");
        Stream<String> stringStream = stringList.stream();
        stringStream.forEach(System.out::println);

    }
}
