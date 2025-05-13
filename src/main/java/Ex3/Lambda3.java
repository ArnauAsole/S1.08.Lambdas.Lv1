package Ex3;

import java.util.Arrays;
import java.util.List;

public class Lambda3 {
    public static void main(String[] args) {
        List<String> months = Arrays.asList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        );

        System.out.println("Months printed using lambda:");
        months.forEach(month -> System.out.println(month));
    }
}