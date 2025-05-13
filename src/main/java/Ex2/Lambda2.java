package Ex2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "streaming", "coding");

        List<String> result = words.stream()
                .filter(s -> s.contains("o") && s.length() > 5)
                .collect(Collectors.toList());

        System.out.println("Strings containing 'o' and longer than 5 characters: " + result);
    }
}