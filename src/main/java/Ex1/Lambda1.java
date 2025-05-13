package Ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "stream", "code");

        List<String> result = words.stream()
                .filter(s -> s.contains("o"))
                .collect(Collectors.toList());

        System.out.println("Strings containing 'o': " + result);
    }
}