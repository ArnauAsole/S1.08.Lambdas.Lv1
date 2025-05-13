package Ex4;

import java.util.Arrays;
import java.util.List;

public class Lambda4 {
    public static void main(String[] args) {
        List<String> months = Arrays.asList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        );

        System.out.println("Months printed using method reference:");
        months.forEach(System.out::println);
    }
}