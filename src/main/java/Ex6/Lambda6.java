package Ex6;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Lambda6 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("cat", "elephant", "dog", "ant", "giraffe");

        items.sort(Comparator.comparingInt(String::length));
        System.out.println("Sorted from shortest to longest: ");
        items.forEach(System.out::println);
    }
}