public class Main {
    public static void main(String[] args) {

        String string = "Hello 8 world";

        validateNoNumbersManual(string);


    }
    public static void validateNoNumbersManual(String input) {
        if (input == null) {
            return;
        }

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new IllegalArgumentException("Строка не должна содержать число!");
            }
        }
    }
}