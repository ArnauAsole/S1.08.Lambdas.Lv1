package Ex7;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class Lambda7 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("cat", "elephant", "dog", "ant", "giraffe");

        items.sort(Comparator.comparingInt(String::length).reversed());
        System.out.println("Sorted from longest to shortest: " + items);
    }
}