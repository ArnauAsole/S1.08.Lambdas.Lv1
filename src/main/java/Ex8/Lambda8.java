package Ex8;

public class Lambda8 {
    public static void main(String[] args) {
        Reverser reverser = (s) -> new StringBuilder(s).reverse().toString();

        String input = "Lambda";
        String result = reverser.reverse(input);

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + result);
    }
}

@FunctionalInterface
interface Reverser {
    String reverse(String input);
}